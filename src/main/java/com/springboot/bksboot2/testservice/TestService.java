package com.springboot.bksboot2.testservice;

import java.util.Arrays;
// import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
     * :(콜론) 뒤에 기본값을 지정해두면 참조하고 있는 .properties 파일에 값이 입력되지 않았을때 기본으로 주입할 값을 설정해둘 수 있습니다. 
     * @null을 입력해 두었는데 null과 @null의 차이점은 문자열로 인식하느냐 정말 null값으로 인식하느냐의 차이입니다. 
     * null로 해두면 "null" 이라는 문자열이 기본값으로 주입되며, @null로 해둔경우 null값이 들어값니다.
     * 출처: https://dololak.tistory.com/545 [코끼리를 냉장고에 넣는 방법]
     */
    @Value("${hello:hello_default}") // :test 부분을 넣지 않았을 경우 에러 발생 ?????
    String[] varTestValues;

    @Value("${foo:foo_default}") // :test 부분을 넣지 않았을 경우 에러 발생 ?????
    String varFooValues;

    /**
     * application.properties 에서 주어진 값. commandline 의 argument 값이 우선시 된다.
     * VM options : -D... 로 시작하는 argument
     * Enviroment variables : --...로 시작하는 argument
     */
    @Value("${name:name_default}")
    String varName;

    /**
     * java -jar target/bksboot2-0.0.1-SNAPSHOT.jar --hello=hello --foo=world --name=commandName
     * Order 1. $ java -jar myapp.jar --spring.application.json='{"name":"test"}'
     * Order 2. $ java -Dspring.application.json='{"name":"test"}' -jar myapp.jar
     * Order 3. $ SPRING_APPLICATION_JSON='{"acme":{"name":"test"}}' java -jar myapp.jar
     * @return --hello=Hello -hello=World => ["Hello", "World"] => "Hello,World"
     */
    public String getMessage() {

        // List<String> testArgsValues = arguments.getOptionValues("hello");
        // return testArgsValues.stream().collect(Collectors.joining(","));
        String strRtn = "Hello = " + Arrays.stream(varTestValues).collect(Collectors.joining(","));
        strRtn += ", Foo = " + varFooValues + ", Name = " + varName;
        return strRtn;

        // return "test service ver3";
        
    }

    // @PostConstruct //라이프 사이클 애노테이션. 빈으로 만들고 바로 다음 호출되는 메소드 설정
    // public void init() {
    //     throw new RuntimeException("User Exception");
    // }
}