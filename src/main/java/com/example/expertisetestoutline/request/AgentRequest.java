package com.example.expertisetestoutline.request;

import com.example.expertisetestoutline.model.Team;

public class AgentRequest {

	//private Long agentid;
	private String firstName;
	private String lastName;
	private String idNumber;

	private TeamRequest team;


//	public Long getAgentid() {
//		return agentid;
//	}
//
//	public void setAgentid(Long agentid) {
//		this.agentid = agentid;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public TeamRequest getTeam() {
		return team;
	}

	public void setTeam(TeamRequest team) {
		this.team = team;
	}

	
	

}
