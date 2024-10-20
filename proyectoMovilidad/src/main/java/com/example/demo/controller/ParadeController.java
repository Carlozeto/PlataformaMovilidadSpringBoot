package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.parade;
import com.example.demo.entities.route;
import com.example.demo.services.ParadeService;
import com.example.demo.services.RouteService;

@Controller
public class ParadeController {
	
	@Autowired
	public ParadeService paradeService;
	
	@GetMapping({"/searchBus"})
	public String searchParade(Model model) {
		try {
			List<parade> listParade = paradeService.findAll();
			System.out.println(listParade);
			model.addAttribute("parade", listParade);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "admin/parade/index";
	}

}
