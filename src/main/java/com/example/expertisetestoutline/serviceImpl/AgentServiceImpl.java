package com.example.expertisetestoutline.serviceImpl;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.expertisetestoutline.model.Agent;
import com.example.expertisetestoutline.model.Team;
import com.example.expertisetestoutline.repositories.AgentRepository;
import com.example.expertisetestoutline.repositories.TeamRepository;
import com.example.expertisetestoutline.request.AgentRequest;
import com.example.expertisetestoutline.service.AgentService;

@Service
public class AgentServiceImpl implements AgentService {
	
	@Autowired
	AgentRepository agentRepo;
	
	@Autowired
	TeamRepository teamRepo;

	@Override
	public Agent createAgent(AgentRequest request) {
		Agent agent = new Agent();
		agent.setFirstName(request.getFirstName());
		agent.setLastName(request.getLastName());
		agent.setIdNumber(request.getIdNumber());
		if (request.getTeam() != null) {
			Team team = new Team();
			team.setName(request.getTeam().getName());
			agent.setTeam(team);
			
		}
		Agent save = agentRepo.save(agent);
		return save;
	}

	@Override
	public Page<Agent> getPrintersResponse(PageRequest pageRequest) {
		Page<Agent> printersList = null;
		printersList = agentRepo.findAll(pageRequest);
		return printersList;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
