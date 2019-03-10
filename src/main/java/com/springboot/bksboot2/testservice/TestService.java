package com.springboot.bksboot2.testservice;

// import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

/**
 * TestService
 */
@Service
public class TestService {

    public String getMessage() {
        return "test service ver3";
        
    }

    // @PostConstruct //라이프 사이클 애노테이션. 빈으로 만들고 바로 다음 호출되는 메소드 설정
    // public void init() {
    //     throw new RuntimeException("User Exception");
    // }
}