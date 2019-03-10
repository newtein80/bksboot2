package com.springboot.bksboot2;

import com.springboot.bksboot2.testconfig.TestConfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest // 사용법????? Test 가 skip 되는 이유?????
public class DemoApplicationTests {

	@Autowired
	TestConfig	testConfig;

	@Test
	public void testConfigWired() {
		// application.xml 이 존재할 경우 @SpringBootApplication 에서 해당 파일을 읽어 bean 등록을 하게 되는데 이때 사용하지 않는 xml을 삭제해줘야 한다.
		Assert.assertNotNull(testConfig);
		Assert.assertNotNull(testConfig.getTestConfigRepository());
	}

	// @Test
	// public void contextLoads() {
	// }

}
