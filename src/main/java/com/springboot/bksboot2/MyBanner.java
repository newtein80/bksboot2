package com.springboot.bksboot2;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

/**
 * MyBanner
 */
public class MyBanner implements Banner {

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        out.println("My Banner !!");
    }
}