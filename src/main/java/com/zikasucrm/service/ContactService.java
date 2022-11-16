package com.zikasucrm.service;

import java.util.List;

import com.zikasucrm.entities.Contact;

public interface ContactService {

	public void saveContact(Contact contact);
	
	public List<Contact> getAllContact();
	
	public Contact findContactById(long id);
	
	public void deleteOneLead(long id);
}
