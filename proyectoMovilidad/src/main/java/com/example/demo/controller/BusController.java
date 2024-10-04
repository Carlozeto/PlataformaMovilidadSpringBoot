package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.bus;
import com.example.demo.services.BusService;

@Controller
public class BusController{
	
	@Autowired
	public BusService busService;

	@GetMapping("/listBus")
	public String listBus(Model model) {
		try {
			List<bus> listBus = busService.findAll();
			model.addAttribute("bus", listBus);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "admin/bus/index";
	}
	
	@GetMapping("/addBus")
	public String addBus() {
		return "admin/bus/add";
	}
	
}
