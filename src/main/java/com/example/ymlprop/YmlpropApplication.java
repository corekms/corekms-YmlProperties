package com.example.ymlprop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class YmlpropApplication {
	public static void main(String[] args) {
		final ApplicationContext ctx = SpringApplication.run(YmlpropApplication.class, args);
		final Team team = ctx.getBean(Team.class);
		System.out.println("--- Team ---");
		System.out.println(team);
	}
} 