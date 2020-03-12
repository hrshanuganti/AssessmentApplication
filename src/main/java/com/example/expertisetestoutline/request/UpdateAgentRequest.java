package com.example.expertisetestoutline.request;

public class UpdateAgentRequest {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String idNumber;
    private TeamRequest team;
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
    
    

}
