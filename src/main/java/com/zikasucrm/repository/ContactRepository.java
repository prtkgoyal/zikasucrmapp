package com.zikasucrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zikasucrm.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
