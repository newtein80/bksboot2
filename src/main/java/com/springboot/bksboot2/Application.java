package com.springboot.bksboot2;
// 현재 위치가 root package

import com.springboot.bksboot2.testservice.MyPojoProperties;
import com.springboot.bksboot2.testservice.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
// import org.springframework.boot.WebApplicationType;
// import org.springframework.boot.Banner.Mode;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.validation.annotation.Validated;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

// @Import 사용법 ?????
//@SpringBootApplication // 스프링 부트 가이드에서처럼 만들 수 없어서 주석 처리했더니 에러 발생하여 주석 삭제하였다.
// @RestController // stereotype annotation. In this case, this controller handling incoming web request
// @EnableAutoConfiguration // 의존성과 관련하여 자동 설정 파일이 적용됨. spring starter web 이 설정되어있을때 특정 설정파일이 적용되도록 되어있음
// @Configuration
// // @ComponentScan // @SpringBootApplication = @EnableAutoConfiguration + @Configuration + @ComponentScan
@SpringBootApplication // SpringBootApplication 클래스의 위치 기준으로 하위 클래스를 스캔하여 bean으로 등록 (SpringBootApplication 이 ComponentScan 을 포함???)
// exclude 속성을 정의하여 제외 할 수도 있으며, properties 파일을 이용하여 제외 할 수도있음
// @ImportResource("application.xml") // ImportResource 사용하여 xml 설정을 사용할 수 있음
@RestController // 없을시 localhost:8080 할 경우 white??에러페이지로 감 // re-package 를 반드시 실행해야함?
// @EnableConfigurationProperties(MyPojoProperties.class)
// 없어도 environment 에 들어감 // MyPojoProperties 클래스에 @Component annotation이 없으면 @EnableConfigurationProperties(MyPojoProperties.class) 줘서 설정 할 수 있음
public class Application {

	@Autowired
	TestService testService;

	@Autowired
	Environment evn;

	@Bean // 빈 등록이 가능한 이유는 @SpringBootApplication이 @Configuration 을 포함하고 있기때문에 등록 가능하다.
	public ExitCodeGenerator exitCodeGenerator() {
		return () -> 42;
	}

	// MyPojoProperties 가 다른 third party 라이브러리의 클래스라고 가정할 때 다음과 같이 properties 빈으로 사용 할 수있음
	// https://github.com/spring-projects/spring-boot/tree/v2.1.3.RELEASE/spring-boot-samples/spring-boot-sample-property-validation
	// https://blog.outsider.ne.kr/835
	@Bean
	@ConfigurationProperties("testproperties")
	@Validated // @ConfigurationProperties 와 같이 다녀야 한다.
	public MyPojoProperties myPojoProperties(){
		return new MyPojoProperties();
	}

	public static void main(String[] args) {
		// https://docs.spring.io/spring-boot/docs/2.1.3.RELEASE/api/org/springframework/boot/SpringApplication.html
		// 1. Create an appropriate ApplicationContext instance (depending on your classpath)
		// 2. Register a CommandLinePropertySource to expose command line arguments as Spring properties
		// 3. Refresh the application context, loading all singleton beans
		// 4. Trigger any CommandLineRunner beans
		// ApplicationContext 는 빈을 관리 (= 빈은 ApplicationContext에 등록이되어야만 사용가능(???)), Listener는 빈이 될 수 없음?????
		// ApplicationContext Events : https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-application-events-and-listeners
		
		SpringApplication app = new SpringApplication(Application.class);
		// app.setBanner(new MyBanner()); // resource 폴더 내의 txt 문서가 먼저임
		// app.setBannerMode(Mode.OFF);;
		app.addListeners(new TestListener());
		// app.setWebApplicationType(WebApplicationType.SERVLET);
		// app.setApplicationContextClass(applicationContextClass);
		// app.setAddCommandLineProperties(false); // CommandLineProperties(ex. --foo=fooValue) 무시
		app.run(args);
		// SpringApplication.run(Application.class, args);

		// System.exit(SpringApplication.exit(SpringApplication.run(ExitCodeApplication.class, args)));
	}

	@RequestMapping("/")
	public String home() {
		//return "hello world";
		System.out.println(evn.getProperty("testproperties.pojoList[0].name"));
		System.out.println(evn.getProperty("testproperties.name"));
		System.out.println("*** work-for : " + myPojoProperties().getWorkFor());
		System.out.println("*** whereToGo : " + myPojoProperties().getWhereToGo());
		System.out.println("*** foo_bar : " + myPojoProperties().getFooBar());
		System.out.println("*** time1 : " + myPojoProperties().getTime1());
		System.out.println("*** time2 : " + myPojoProperties().getTime2());
		System.out.println("*** time3 : " + myPojoProperties().getTime3());
		System.out.println("*** nubmer2 : " + myPojoProperties().getNumber2());
		return testService.getMessage();
	}

}