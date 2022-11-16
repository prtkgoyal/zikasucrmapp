package com.zikasucrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zikasucrm.dto.Email;
import com.zikasucrm.util.EmailService;

@Controller
public class EmailController {

	@Autowired
	private EmailService emailservice;
	
	
	@PostMapping("/sendEmail")
	public String sendEmailId(@RequestParam("email") String email,ModelMap model) {
		model.addAttribute("email", email);
		return "compose_email";
	}
	
	@PostMapping("/triggerEmail")
	public String sendEmail(Email email ,Model model) {
		emailservice.sendSimpleMail(email.getEmail(), email.getSubject(), email.getContent());
		model.addAttribute("msg", "email sent!!");
		return "compose_email";
}
	
}
