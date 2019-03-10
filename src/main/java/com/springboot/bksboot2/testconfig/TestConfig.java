package com.springboot.bksboot2.testconfig;

// import org.springframework.beans.factory.annotation.Autowired;

// import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;

/**
 * TestConfig
 */
// @Service // 빈으로 등록 // testConfiguration.class 에서 가져다가 씀
@Service // @servcie annotation을 삭제 + xml 설정파일 사용 = 테스트 에러 <-- bean으로 등록이 되지 않기때문에
public class TestConfig {

    // @Autowired
    // TestConfigRepository testConfigRepository;
    private final TestConfigRepository testConfigRepository; // 레퍼런스가 바뀌지 않도록 final 을 명시

    // @Autowired
    public TestConfig(TestConfigRepository testConfigRepository){
        this.testConfigRepository = testConfigRepository;
    }

    /**
     * @return the testConfigRepository
     */
    public TestConfigRepository getTestConfigRepository() {
        return testConfigRepository;
    }
}