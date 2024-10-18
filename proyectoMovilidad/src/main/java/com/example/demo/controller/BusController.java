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
import com.example.demo.entities.enterprise;
import com.example.demo.entities.route;
import com.example.demo.services.BusService;
import com.example.demo.services.EnterpriseService;
import com.example.demo.services.RouteService;

@Controller
public class BusController{
	
	@Autowired
	public BusService busService;
	@Autowired
	public EnterpriseService enterpriseService;
	@Autowired
	public RouteService routeService;

	@GetMapping({"/listBus", "/"})
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

	
	@GetMapping("/formBus")
	public String mostrarFormulario(Model model) { 
		try {
		List<enterprise> listEnterprise = enterpriseService.findAll();
		model.addAttribute("enterprise", listEnterprise);
		List<route> listRoute = routeService.findAll();
		model.addAttribute("route", listRoute);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		bus bus1 = new bus();
		model.addAttribute("bus", bus1);
	    return "admin/bus/add";
	}
	
	
	
	@PostMapping("/addBus")
	public String addBus(@ModelAttribute("bus") bus Bus) { 
	    busService.save(Bus);
	    return "redirect:/listBus";
	}
	
	@GetMapping("/editBus/{id}")
	public String editBus(@PathVariable("id") String id, Model model) {
	    try {
	        Optional<bus> bus = busService.findById(id);
	        try {
				List<enterprise> listEnterprise = enterpriseService.findAll();
				model.addAttribute("enterprise", listEnterprise);
				List<route> listRoute = routeService.findAll();
				model.addAttribute("route", listRoute);
				}
				catch(Exception e) {
					System.out.println("Error: "+e);
			}
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
	
	@PostMapping("/updateBus/{id}")
	public String updateBus(@PathVariable("id") String id, @ModelAttribute("bus") bus Bus, Model model) {
		 Optional<bus> busFind = busService.findById(id);
		    if (busFind.isPresent()) {
		    	bus busUpd = busFind.get(); 
		    	busUpd.setBusPlaque(Bus.getBusPlaque());
		    	busUpd.setBusLicenseId(Bus.getBusLicenseId());
		    	busUpd.setBusManufacturer(Bus.getBusManufacturer());
		    	busUpd.setBusManufacturerModel(Bus.getBusManufacturerModel());
		    	busUpd.setBusCC(Bus.getBusCC());
		    	busUpd.setBusColor(Bus.getBusColor());
		    	busUpd.setBusVehicleClass(Bus.getBusVehicleClass());
		    	busUpd.setBusMotorId(Bus.getBusMotorId());
		    	busUpd.setBusChasisId(Bus.getBusChasisId());
		    	busUpd.setBusCapacity(Bus.getBusCapacity());
		    	busUpd.setBusOwnerId(Bus.getBusOwnerId());
		    	busUpd.setBusDriverId(Bus.getBusDriverId());
		    	busUpd.setBusEnterpriseId(Bus.getBusEnterpriseId());
		    	busUpd.setBusRouteId(Bus.getBusRouteId());
		    	busService.save(busUpd);
		    }
	    return "redirect:/listBus";
	}
	
	@GetMapping("/deleteBus/{id}")
	public String deleteBus(@PathVariable("id") String id) {
	    try {
	        busService.deleteById(id);
	    } catch (Exception e) {
	        System.out.println("Error al eliminar el bus: " + e);
	    }
	    return "redirect:/listBus";
	}
}
