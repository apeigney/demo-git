package com.sfr.bonjour.service;

import com.sfr.bonjour.plugin.Plugin;
import com.sfr.bonjour.plugin.PluginDeactivationException;
import com.sfr.bonjour.plugin.PluginManager;

import java.util.List;

public class PluginService {

    private final ResourceResolver resourceResolver = new ResourceResolver();

    private PluginManager getManager() throws PluginDeactivationException {
        if (resourceResolver.pluginsEnabled()) {
            return new PluginManager();
        }
        throw new PluginDeactivationException("Plugins not activated");
    }

    public void register(Plugin plugin) throws PluginDeactivationException {
        getManager().addPlugin(plugin);
    }

    public List<Plugin> getAll() throws PluginDeactivationException {
        return getManager().getPlugins();
    }
}
