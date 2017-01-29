package com.sfr.bonjour.plugin;

/**
 * Created by adrienpeigney on 29/01/2017.
 */
public class PluginDeactivationException extends Exception {

    public PluginDeactivationException(String message, Throwable cause) {
        super(message, cause);
    }

    public PluginDeactivationException(String message) {
        super(message);
    }
}
