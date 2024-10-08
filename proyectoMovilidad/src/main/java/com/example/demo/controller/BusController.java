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
	
	@PostMapping("/addBus")
	public String addBus(@ModelAttribute("bus") bus bus) { 
	    try {
	        busService.save(bus); 
	    } catch (Exception e) {
	        System.out.println("Error al agregar el bus: " + e);
	    }
	    return "redirect:/listBus";
	}
	
	@GetMapping("/editBus/{id}")
	public String editBus(@PathVariable("id") String id, Model model) {
	    try {
	        Optional<bus> bus = busService.findById(id);
	        if (bus.isPresent()) {
	            model.addAttribute("bus", bus.get());
	            return "admin/bus/edit";
	        } else {
	            return "redirect:/listBus"; 
	        }
	    } catch (Exception e) {
	        System.out.println("Error al obtener el bus: " + e);
	        return "redirect:/listBus";
	    }
	}
	
	@PostMapping("/updateBus")
	public String updateBus(@ModelAttribute("bus") bus bus) {
	    try {
	        busService.save(bus); 
	    } catch (Exception e) {
	        System.out.println("Error al actualizar el bus: " + e);
	    }
	    return "redirect:/listBus";
	}
	
	@DeleteMapping("/deleteBus/{id}")
	public String deleteBus(@PathVariable("id") String id) {
	    try {
	        busService.deleteById(id);
	    } catch (Exception e) {
	        System.out.println("Error al eliminar el bus: " + e);
	    }
	    return "redirect:/listBus";
	}
}
