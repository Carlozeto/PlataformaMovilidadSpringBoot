package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusController{

	@GetMapping("/bus")
	public String init() {
		return "admin/bus/index";
	}
	
}
