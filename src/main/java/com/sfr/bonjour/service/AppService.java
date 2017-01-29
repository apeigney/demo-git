package com.sfr.bonjour.service;

/**
 * Created by adrienpeigney on 29/01/2017.
 */
public class AppService {

    private final ResourceResolver resourceResolver = new ResourceResolver();

    public AppService() {
    }

    public void start() {
        System.out.println("Starting application");
    }

    public void stop() {
        System.out.println("Stopping application");
    }

    public boolean mockEnabled() {
        return resourceResolver.mockEnabled();
    }
}
