package com.sfr.bonjour.plugin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adrienpeigney on 29/01/2017.
 */
public class PluginManager {

    private List<Plugin> plugins = new ArrayList<Plugin>();

    public void addPlugin(Plugin plugin) {
        plugins.add(plugin);
    }

    public List<Plugin> getPlugins() {
        return plugins;
    }
}
