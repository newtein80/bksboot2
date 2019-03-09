package com.springboot.bksboot2;

// import static org.junit.Assert.assertNotNull;
// import static org.mockito.ArgumentMatchers.notNull;

import com.springboot.bksboot2.testconfig.TestConfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
// import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * TestConfigTest
 */
// @RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
// @SpringBootTest --> main 클래스의 @SpringBootApplication 과 @SpringBootTest 의 관계와 사용법 ?????
@ContextConfiguration(classes = Application.class)
public class TestConfigTest {

    @Autowired
    TestConfig testConfig;

    @Test
    public void diTest() {
        Assert.assertNotNull(testConfig);
    }
}