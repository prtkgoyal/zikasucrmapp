package com.zikasucrm.service;

import java.util.List;

import com.zikasucrm.entities.Lead;

public interface LeadService {

	public void saveOneLead(Lead lead);
	
	public Lead findLeadById(long id);
	
	public void deleteById(long id);
	
	public List<Lead> getAllLeads();
}
