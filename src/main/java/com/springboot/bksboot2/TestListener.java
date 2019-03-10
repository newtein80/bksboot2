package com.springboot.bksboot2;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * TestListener
 */
public class TestListener implements ApplicationListener<ApplicationStartedEvent>{

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("*** Application Started Event...");
    }

    
}