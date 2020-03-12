package com.example.expertisetestoutline.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expertisetestoutline.model.Team;
import com.example.expertisetestoutline.repositories.TeamRepository;
import com.example.expertisetestoutline.request.TeamRequest;
import com.example.expertisetestoutline.service.TeamService;

@Service
public class TeamServiceImpl  implements TeamService{
	
	@Autowired
	TeamRepository teamRepo;
	
	@Transactional
	@Override
	public Team createTeam(TeamRequest request) {
		Team team = new Team();
		team.setName(request.getName());
		Team save = teamRepo.save(team);
		return save;
	}
	
	
	

}
