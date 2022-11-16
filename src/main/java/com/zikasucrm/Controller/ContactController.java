package com.zikasucrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zikasucrm.entities.Contact;
import com.zikasucrm.entities.Lead;
import com.zikasucrm.service.ContactService;
import com.zikasucrm.service.LeadService;

@Controller
public class ContactController {

	private ContactService contactservice;

	
	public ContactController(ContactService contactservice) {			//Autowired
		this.contactservice = contactservice;
	}

	@Autowired
	private LeadService leadservice;

	
	
	@RequestMapping("/listallcontacts")
	public String listAllContacts(Model model) {
		List<Contact> contacts = contactservice.getAllContact();
		model.addAttribute("contacts" ,contacts);
		return "list_contacts";
	}
	@RequestMapping("/contactInfo")
	public String convertContact(@RequestParam("id")long id ,Model model) {
		  Contact contact = contactservice.findContactById(id);
		  model.addAttribute("contact", contact);
		  return "contact_info";
	}
	@PostMapping("/convertcontact")
	public String convertingContacts(@RequestParam("id")long id ,Model model) {
		Contact contact = contactservice.findContactById(id);
		Lead lead =new Lead();
		lead.setFirstName(contact.getFirstName());
		lead.setLastName(contact.getLastName());
		lead.setEmail(contact.getEmail());
		lead.setMobile(contact.getMobile());
		lead.setSource(contact.getSource());
		leadservice.saveOneLead(lead);
		contactservice.deleteOneLead(id);
		List<Lead> leads = leadservice.getAllLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
