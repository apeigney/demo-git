package com.sfr.bonjour.app;

import com.sfr.bonjour.service.AppService;

/**
 * Created by adrienpeigney on 29/01/2017.
 */
public class Main {


    public static void main(String[] args) {
        AppService appService = new AppService();
        appService.start();
    }

}
