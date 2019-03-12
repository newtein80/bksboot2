package com.springboot.bksboot2.testservice;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * TestProfileBeanProd
 */
@Component
@Profile("prod")
public class TestProfileBeanProd implements ITestBean{

    @Override
    public String getMessage() {
        return "prod bean !";
    }

    
}