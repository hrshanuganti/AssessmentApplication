package com.example.expertisetestoutline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.expertisetestoutline.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
	
	@Query(value = "select a from Team a where id = :id")
	Team findById(@Param(value = "id") Long id);

	
}
