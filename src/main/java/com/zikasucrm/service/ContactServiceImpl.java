package com.zikasucrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zikasucrm.entities.Contact;
import com.zikasucrm.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactrepo;
	@Override
	public void saveContact(Contact contact) {
		contactrepo.save(contact);
	}
	@Override
	public List<Contact> getAllContact(){
		List<Contact> contact = contactrepo.findAll();
		return contact;
	}
	@Override
	public Contact findContactById(long id) {
		Optional<Contact> findById = contactrepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}
	@Override
	public void deleteOneLead(long id) {
		contactrepo.deleteById(id);
	}
}
