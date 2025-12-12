package com.vlad.backenddemo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(properties = ["spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration"])
class BackendDemoApplicationTests {

	@Test
	fun contextLoads() {
	}

}
