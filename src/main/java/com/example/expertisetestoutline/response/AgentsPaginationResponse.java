package com.example.expertisetestoutline.response;

import java.util.ArrayList;
import java.util.List;

import com.example.expertisetestoutline.exceptionhandler.GenericResponse;

public class AgentsPaginationResponse extends GenericResponse{
	
	private int totalPages;
	private int page;
	private int size;
	private long totalElements;
	private List<AgentDescription>  agentDescriptions = new ArrayList<AgentDescription>();
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public List<AgentDescription> getAgentDescriptions() {
		return agentDescriptions;
	}
	public void setAgentDescriptions(List<AgentDescription> agentDescriptions) {
		this.agentDescriptions = agentDescriptions;
	}
	
	
	
	

}
