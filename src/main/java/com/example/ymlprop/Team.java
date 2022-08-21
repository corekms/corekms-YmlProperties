package com.example.ymlprop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties(prefix="app")
@Validated
public class Team {
	// @NotBlank
	private String team;
	@NumberFormat
	private int teamSize;
	// @Size(max=30)
	private String teamLeader;
	// @NotNull

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getTeamLeader() {
		return teamLeader;
	}

	public void setTeamLeader(String teamLeader) {
		this.teamLeader = teamLeader;
	}


	@Override
	public String toString() {
		return "{" +
			" team='" + getTeam() + "'" +
			", teamSize='" + getTeamSize() + "'" +
			", teamLeader='" + getTeamLeader() + "'" +
			"}";
	}

}