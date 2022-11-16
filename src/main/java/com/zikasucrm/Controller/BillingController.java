package com.zikasucrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zikasucrm.entities.Bill;
import com.zikasucrm.entities.Contact;
import com.zikasucrm.service.BillService;
import com.zikasucrm.service.ContactService;

@Controller
public class BillingController {

	
	@Autowired
	private ContactService contactservice;
	
	@Autowired
	private BillService billservice;
	
	
	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id")long id ,Model model) {
		Contact contact = contactservice.findContactById(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	@PostMapping("saveBill")
	public String saveBill(@ModelAttribute("bill")Bill bill ,Model model) {
		billservice.saveOneBill(bill);
		
		List<Contact> contacts = contactservice.getAllContact();
		model.addAttribute("contacts",contacts);
		return "list_contacts";
	}
}














