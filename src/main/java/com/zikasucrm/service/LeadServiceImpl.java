package com.zikasucrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zikasucrm.entities.Lead;
import com.zikasucrm.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	
	@Autowired
	private LeadRepository leadrepo;
	
	
	@Override
	public void saveOneLead(Lead lead) {
		leadrepo.save(lead);
	}

	@Override
	public Lead findLeadById(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override
	public void deleteById(long id) {
		leadrepo.deleteById(id);
	}
	public List<Lead> getAllLeads(){
		List<Lead> leads = leadrepo.findAll();
		return leads;
	}
}
