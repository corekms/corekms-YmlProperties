package com.example.ymlprop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="app")
public class Team {
	
	static private String TEAM_NAME;
	static private int TEAM_SIZE;
	static private String TEAM_LEADER;

	public static String getTeamName() {
		return TEAM_NAME;
	}

	@Value("${app.team-name}")
	public void setTeamName(String teamName) { 
		Team.TEAM_NAME = teamName;
	}

	public static int getTeamSize() {
		return TEAM_SIZE;
	}
	@Value("${app.team-size}")
	public void setTeamSize(int teamSize) {
		Team.TEAM_SIZE = teamSize;
	}

	public static String getTeamLeader() {
		return TEAM_LEADER;
	}

	@Value("${app.team-leader}")
	public void setTeamLeader(String teamLeader) {
		Team.TEAM_LEADER = teamLeader;
	}

	@Override
	public String toString() {
		return "{" +
			" team='" + getTeamName() + "'" +
			", teamSize='" + getTeamSize() + "'" +
			", teamLeader='" + getTeamLeader() + "'" +
			"}";
	}

}