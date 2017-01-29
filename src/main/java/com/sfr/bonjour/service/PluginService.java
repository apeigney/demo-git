package com.sfr.bonjour.service;

import com.sfr.bonjour.plugin.PluginManager;

public class PluginService {

    private final ResourceResolver resourceResolver = new ResourceResolver();

    public PluginManager getManager() {
        if (resourceResolver.pluginsEnabled()) {
            return new PluginManager();
        }
        return null;
    }
}
