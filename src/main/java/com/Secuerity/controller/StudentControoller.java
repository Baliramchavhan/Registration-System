package com.Secuerity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Secuerity.EntitiyLiyer.StudentSecuerity;
import com.Secuerity.service.ServiceClass;

@Controller
public class StudentControoller {

	@Autowired
	private ServiceClass service;
	
	@GetMapping("/reg")
	String regfrom(Model model) {
		model.addAttribute("studentSecurity", new StudentSecuerity());
		return "registration1";
	}
	
	@PostMapping("/reg")
	String restration(@ModelAttribute("studentSecurity") StudentSecuerity secuerity) {
		service.SaveStudent(secuerity);
		return "Studentlogin";
	}
	 @GetMapping("/login")
	    public String loginForm() {
	        return "welcome";
	    }
}