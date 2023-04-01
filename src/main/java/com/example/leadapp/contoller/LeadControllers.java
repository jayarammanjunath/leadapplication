package com.example.leadapp.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.leadapp.service.LeadsService;

@Controller
public class LeadControllers {
	@Autowired
	private LeadsService leadservobj;
	@RequestMapping("/showpage")
	public String saveOneLead() {
		return "viewloginpg";		
	}
	
}
