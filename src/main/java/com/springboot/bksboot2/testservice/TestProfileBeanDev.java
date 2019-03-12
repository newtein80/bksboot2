package com.springboot.bksboot2.testservice;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * TestProfileBeanDev
 */
@Component
@Profile("dev")
public class TestProfileBeanDev implements ITestBean{

    @Override
    public String getMessage() {
        return "dev bean !";
    }

    
}