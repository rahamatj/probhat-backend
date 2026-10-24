package com.rahamat.probhat_backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
		"spring.datasource.url=jdbc:h2:mem:probhat-test",
		"spring.datasource.driver-class-name=org.h2.Driver",
		"spring.datasource.username=sa",
		"spring.datasource.password="
})
class ProbhatBackendApplicationTests {

	@Test
	void contextLoads() {
	}

}
