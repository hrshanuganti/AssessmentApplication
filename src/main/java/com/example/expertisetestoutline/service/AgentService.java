package com.example.expertisetestoutline.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.expertisetestoutline.model.Agent;
import com.example.expertisetestoutline.request.AgentRequest;

public interface AgentService {
	
	Agent createAgent(AgentRequest request);
	
	Page<Agent> getPrintersResponse(PageRequest pageRequest);


}
