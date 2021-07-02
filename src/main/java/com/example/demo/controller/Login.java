package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.LoginDTO;
@Controller
public class Login {
	@GetMapping("/login")  
	public String getloginForm() {
		return "loginCss";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute(name="loginDTO") LoginDTO loginDTO,Model model) {		
		/*
		
		String userName=loginDTO.getEmail();
		String password=loginDTO.getPassword();
		System.out.println(userName+password);
		if("admin@gmail.com".equals(userName)&&"admin".equals(password))
		return "home";
		model.addAttribute("invalidCredentials", true);
		return "loginCss";
		*/
		return "home";
	}

	
}
