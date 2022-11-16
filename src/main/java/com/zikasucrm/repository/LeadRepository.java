package com.zikasucrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zikasucrm.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
