package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.city;
import com.example.demo.services.CityService;

@Controller
public class CityController{
	
	@Autowired
	public CityService cityController;

	@GetMapping("/listCity")
	public String listCity(Model model) {
		try {
			List<city> listCity = cityController.findAll();
			model.addAttribute("city", listCity);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "admin/city/index";
	}
	
	@GetMapping("/addCity")
	public String addBus() {
		return "admin/city/add";
	}
	
	
}
