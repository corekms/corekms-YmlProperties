package com.example.ymlprop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YmlPropApplication {
	public static void main(String[] args) {
		SpringApplication.run(YmlPropApplication.class, args);
		System.out.println("--- Team ---");
		System.out.println(Team.getTeamLeader());
		System.out.println(Team.getTeamSize());
		System.out.println(Team.getTeamName());
	}
} 