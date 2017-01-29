package com.sfr.bonjour.plugin;

/**
 * Created by adrienpeigney on 29/01/2017.
 */
public class Plugin {

    private final Integer id;
    private final String name;
    private PluginDefinition definition;

    public Plugin(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PluginDefinition getDefinition() {
        return definition;
    }

    public void setDefinition(PluginDefinition definition) {
        this.definition = definition;
    }
}
