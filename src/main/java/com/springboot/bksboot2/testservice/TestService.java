package com.springboot.bksboot2.testservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;

// import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

/**
 * TestService
 */
@Service
public class TestService {

    @Autowired
    ApplicationArguments arguments;

    /**
     * java -jar target/bksboot2-0.0.1-SNAPSHOT.jar --hello=hello --hello=world
     * @return --hello=Hello -hello=World => ["Hello", "World"] => "Hello,World"
     */
    public String getMessage() {

        List<String> testArgsValues = arguments.getOptionValues("hello");
        return testArgsValues.stream().collect(Collectors.joining(","));

        // return "test service ver3";
        
    }

    // @PostConstruct //라이프 사이클 애노테이션. 빈으로 만들고 바로 다음 호출되는 메소드 설정
    // public void init() {
    //     throw new RuntimeException("User Exception");
    // }
}