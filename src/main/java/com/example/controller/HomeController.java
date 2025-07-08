package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.CarOwner;
import com.example.repository.CarOwnerRepository;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;


@Controller
public class HomeController {
	@Autowired
    private CarOwnerRepository carOwnerRepository;
	
	@RequestMapping("/")
	public String Home()
	{
		System.out.println("hi");
		return "home.jsp";
	}
	
	@RequestMapping("saveOwner")
	public String saveCarOwner(@RequestParam Long id, @RequestParam String name) {
	    CarOwner owner = new CarOwner(id, name);
	    carOwnerRepository.save(owner);
	    return "register.jsp";
	}
	
	@RequestMapping("/register")
	public String showRegisterPage() {
	    return "register.jsp"; // This maps to /WEB-INF/views/register.jsp
	}
}
