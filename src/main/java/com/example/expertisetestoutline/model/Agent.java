package com.example.expertisetestoutline.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AGENT")
public class Agent {
	 
	@Column(name = "id")
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)    
    private Long id;
    
	@Column(name = "firstName")   
    private String firstName;
    
	@Column(name = "lastName")   
    private String lastName;
    
	@Column(name = "idNumber")  
    private String idNumber;
    
   // @ManyToOne
    @ManyToOne(cascade=CascadeType.ALL)  
    private Team team;

  
    
   

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
