package com.example.ymlprop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TeamStaticPropertyTest {
  
  @Test
  void testTeamStatic() {
    assertEquals("hi", Team.getTeamName()); ;
    assertEquals(3, Team.getTeamSize()); ;
    assertEquals("prod", Team.getTeamLeader()); ;
  }
}
