package com.sfr.bonjour.plugin;

/**
 * Created by adrienpeigney on 29/01/2017.
 */
public class Plugin {

    private Integer id;
    private String name;
    private PluginDefinition definition;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PluginDefinition getDefinition() {
        return definition;
    }

    public void setDefinition(PluginDefinition definition) {
        this.definition = definition;
    }
}
