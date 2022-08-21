package com.example.ymlprop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TeamTest {
  @Autowired
  private Team team;
  
  @Test
  void checkTeamProperties() {
    assertEquals("", team);
  }
}
