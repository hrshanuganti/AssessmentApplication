package com.example.expertisetestoutline.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.expertisetestoutline.exceptionhandler.GlobalException;
import com.example.expertisetestoutline.model.Agent;
import com.example.expertisetestoutline.model.Team;
import com.example.expertisetestoutline.repositories.AgentRepository;
import com.example.expertisetestoutline.repositories.TeamRepository;
import com.example.expertisetestoutline.request.AgentRequest;
import com.example.expertisetestoutline.request.TeamRequest;
import com.example.expertisetestoutline.service.AgentService;
import com.example.expertisetestoutline.service.CommonService;
import com.example.expertisetestoutline.service.TeamService;

@RestController
@RequestMapping(value = "/api")
public class AgentController {

	@Autowired
	CommonService commonService;

	@Autowired
	TeamService teamService;

	@Autowired
	TeamRepository teamRepo;

	@Autowired
	AgentService agentService;
	
	@Autowired
	AgentRepository agentRepo;
	

	@PostMapping("/team")
	public ResponseEntity<?> team(@Valid @RequestBody TeamRequest request, BindingResult bindingResult)
			throws GlobalException {
		commonService.validate(bindingResult);
		Team team = teamService.createTeam(request);
		return new ResponseEntity<>(team, HttpStatus.OK);

	}

	@GetMapping("/teams")
	public ResponseEntity<?> teams() throws GlobalException {
		List<Team> response = teamRepo.findAll();
		if (response.isEmpty() == true) {
			throw new GlobalException("400", "Bad Request", "No Records Found, Please Create Team ", HttpStatus.BAD_REQUEST);

		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/teams/{id}")
	public ResponseEntity<?> teamById(@PathVariable("id") Long id) throws GlobalException {
		Team response = teamRepo.findById(id);
		if (response == null) {
			throw new GlobalException("400", "Bad Request", "No Records Found, Please Create Team ", HttpStatus.BAD_REQUEST);

		}

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@PostMapping("/agent")
	public ResponseEntity<?> team(@Valid @RequestBody AgentRequest request, BindingResult bindingResult)
			throws GlobalException {
		commonService.validate(bindingResult);
		Agent agent = agentService.createAgent(request);
		return new ResponseEntity<>(agent, HttpStatus.OK);
	}
	
	
	
	@GetMapping("/agents")
	public ResponseEntity<?> agents() throws GlobalException {
		List<Agent> response = agentRepo.findAll();
		if (response.isEmpty() == true) {
			throw new GlobalException("400", "Bad Request", "No Records Found, Please Create Agent ", HttpStatus.BAD_REQUEST);

		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	
	
	@GetMapping("/agent/{id}")
	public ResponseEntity<?> agentById(@PathVariable("id") Long id) throws GlobalException {
		Agent response = agentRepo.findById(id);
		if (response == null) {
			throw new GlobalException("400", "Bad Request", "No Records Found, Please Create Agent ", HttpStatus.BAD_REQUEST);

		}

		return new ResponseEntity<>(response, HttpStatus.OK);

	}
	
	

	
	
	
	
	
	
	

}
