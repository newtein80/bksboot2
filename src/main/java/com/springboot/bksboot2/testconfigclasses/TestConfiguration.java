package com.springboot.bksboot2.testconfigclasses;

import com.springboot.bksboot2.testconfig.TestConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TestConfiguration
 */
@Configuration
public class TestConfiguration {

    @Bean
    public TestConfig testConfig() {
        return new TestConfig();
    }
}