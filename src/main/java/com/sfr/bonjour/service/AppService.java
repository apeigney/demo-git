package com.sfr.bonjour.service;

import com.sfr.bonjour.plugin.Plugin;
import com.sfr.bonjour.plugin.PluginDeactivationException;
import com.sfr.bonjour.plugin.game.GameDefinition;

import java.util.List;

/**
 * Created by adrienpeigney on 29/01/2017.
 */
public class AppService {

    private final PluginService pluginService = new PluginService();

    public void start() {
        System.out.println("Starting application");
        
        // Add game plugin
        Plugin game = new Plugin(1, "Game");
        game.setDefinition(new GameDefinition());
        try {
            pluginService.register(game);
        } catch (PluginDeactivationException e) {
            e.printStackTrace();
        }

        executePLugins();
    }


    public void stop() {
        System.out.println("Stopping application");
    }

    private void executePLugins() {
        try {
            List<Plugin> plugins = pluginService.getAll();
            for (Plugin plugin : plugins) {
                plugin.getDefinition().execute();
            }
        } catch (PluginDeactivationException e) {
            e.printStackTrace();
        }
    }
}
