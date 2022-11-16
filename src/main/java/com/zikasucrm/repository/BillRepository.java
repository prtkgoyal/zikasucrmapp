package com.zikasucrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zikasucrm.entities.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {

}
