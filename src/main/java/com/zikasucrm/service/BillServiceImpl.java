package com.zikasucrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zikasucrm.entities.Bill;
import com.zikasucrm.repository.BillRepository;

@Service
public class BillServiceImpl implements BillService {

	
	@Autowired
	private BillRepository billrepo;
	
	@Override
	public void saveOneBill(Bill bill) {
		billrepo.save(bill);
		
	}

}
