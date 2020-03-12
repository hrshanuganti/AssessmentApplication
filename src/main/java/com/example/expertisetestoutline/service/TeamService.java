package com.example.expertisetestoutline.service;

import com.example.expertisetestoutline.model.Team;
import com.example.expertisetestoutline.request.TeamRequest;

public interface TeamService {
	
	Team createTeam(TeamRequest request);

}
