package com.home.pojos;

import org.apache.log4j.Logger;

/**
 * Created by User on 10.04.2017.
 */
public class Notifier {
    Logger log = Logger.getLogger(Notifier.class);

    public Notifier() {

    }

    public void notifyBefore() {
        String message = "Notify Before";
        System.out.println(message);
        log.info(message);
    }

    public void notifyAfter() {
        String message = "Notify After";
        System.out.println(message);
        log.info(message);
    }

    public void notifyAround() {
        String message = "Notify Around";
        System.out.println(message);
        log.info(message);
    }

    public void notifyAfterReturning() {
        String message = "Notify After Returning";
        System.out.println(message);
        log.info(message);
    }

    public void notifyAfterThrowing(Exception e) {
        String message = "Notify After Throwing!";
        System.out.println(message);
        log.info(message + " Exeption: " + e);
    }
}
