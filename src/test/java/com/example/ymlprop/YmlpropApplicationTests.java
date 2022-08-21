package com.example.ymlprop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YmlPropApplicationTests {

	@Autowired
	private Team team;
	@Test
	void testTeam() {
		System.out.println("====> " +  team.toString());
	}
}
