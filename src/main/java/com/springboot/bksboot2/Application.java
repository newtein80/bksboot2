package com.springboot.bksboot2;
// 현재 위치가 root package

import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @Import 사용법 ?????
//@SpringBootApplication // 스프링 부트 가이드에서처럼 만들 수 없어서 주석 처리했더니 에러 발생하여 주석 삭제하였다.
// @RestController // stereotype annotation. In this case, this controller handling incoming web request
// @EnableAutoConfiguration // 의존성과 관련하여 자동 설정 파일이 적용됨. spring starter web 이 설정되어있을때 특정 설정파일이 적용되도록 되어있음
// @Configuration
// // @ComponentScan // @SpringBootApplication = @EnableAutoConfiguration + @Configuration + @ComponentScan
@SpringBootApplication // SpringBootApplication 클래스의 위치 기준으로 하위 클래스를 스캔하여 bean으로 등록 (SpringBootApplication 이 ComponentScan 을 포함???)
// exclude 속성을 정의하여 제외 할 수도 있으며, properties 파일을 이용하여 제외 할 수도있음
// @ImportResource("application.xml") // ImportResource 사용하여 xml 설정을 사용할 수 있음
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "hello world";
	}

}