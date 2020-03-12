package com.example.expertisetestoutline.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.expertisetestoutline.model.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {
	
	@Query(value = "select a from Agent a where id = :id")
	Agent findById(@Param(value = "id") Long id);
	
	@Query(value = "select a from Agent a  where a.firstName is not null ")
	Page<Agent> findAll(Pageable pageable);


}
