package com.zikasucrm.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;

import com.zikasucrm.entities.Contact;
import com.zikasucrm.entities.Lead;
import com.zikasucrm.service.ContactService;
import com.zikasucrm.service.LeadService;
import com.zikasucrm.util.EmailService;

@Controller
public class LeadController {

	
	
	@Autowired
	private LeadService leadservice;
	
	@Autowired
	private ContactService contactservice;
	
	@GetMapping("/viewLead")
	public String viewCreateLeadPage() {
		return "create_new_lead";
	}
	
	@PostMapping("/save")
	public String saveLead(@ModelAttribute("lead")Lead lead, ModelMap model,@Valid BindingResult result) {
		if(result.hasErrors()) {
		model.addAttribute("lead", lead);
		return "create_new_lead";
		}
		leadservice.saveOneLead(lead);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	@PostMapping("/convertLead")
	public String convertLead(@RequestParam("id")long id, Model model) {
		Lead lead = leadservice.findLeadById(id);
		Contact contact =new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactservice.saveContact(contact);
		leadservice.deleteById(id);
		
		List<Contact> contacts = contactservice.getAllContact();
		model.addAttribute("contacts",contacts);
		return "list_contacts";
	}
	@RequestMapping("/listallleads")
	public String listAllLeads(Model model) {
		List<Lead> leads = leadservice.getAllLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
		
	}	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id")long id, Model model) {
		Lead lead = leadservice.findLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	
	
	
	
	
}
