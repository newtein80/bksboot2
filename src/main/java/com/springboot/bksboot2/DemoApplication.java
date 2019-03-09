package com.springboot.bksboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // 스프링 부트 가이드에서처럼 만들 수 없어서 주석 처리했더니 에러 발생하여 주석 삭제하였다.
@RestController // stereotype annotation. In this case, this controller handling incoming web request
@EnableAutoConfiguration // 의존성과 관련하여 자동 설정 파일이 적용됨. spring starter web 이 설정되어있을때 특정 설정파일이 적용되도록 되어있음
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "hello world";
	}

}