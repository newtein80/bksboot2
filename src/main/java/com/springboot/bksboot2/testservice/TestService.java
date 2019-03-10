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
    @Value("${hello:test}") // :test 부분을 넣지 않았을 경우 에러 발생 ?????
    String[] varTestValues;

    @Value("${foo:fooTest}") // :test 부분을 넣지 않았을 경우 에러 발생 ?????
    String varFooValues;

    /**
     * java -jar target/bksboot2-0.0.1-SNAPSHOT.jar --hello=hello --hello=world
     * @return --hello=Hello -hello=World => ["Hello", "World"] => "Hello,World"
     */
    public String getMessage() {

        // List<String> testArgsValues = arguments.getOptionValues("hello");
        // return testArgsValues.stream().collect(Collectors.joining(","));
        String strRtn = Arrays.stream(varTestValues).collect(Collectors.joining(","));
        strRtn += " " + varFooValues;
        return strRtn;

        // return "test service ver3";
        
    }

    // @PostConstruct //라이프 사이클 애노테이션. 빈으로 만들고 바로 다음 호출되는 메소드 설정
    // public void init() {
    //     throw new RuntimeException("User Exception");
    // }
}