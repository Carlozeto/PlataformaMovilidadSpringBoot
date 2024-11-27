package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.driver;
import com.example.demo.services.DriverService;

@Controller
public class DriverController {

	@Autowired
	public DriverService driverService;
	
	@GetMapping({"/listDriver"})
	public String listBus(Model model) {
		try {
			List<driver> listDriver = driverService.findAll();
			model.addAttribute("bus", listDriver);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "admin/driver/index";
	}
	
	@GetMapping("/formDriver")
	public String mostrarFormulario(Model model) { 
		driver driver1 = new driver();
		model.addAttribute("driver", driver1);
	    return "admin/driver/add";
	}
	
	@PostMapping("/addDriver")
	public String addBus(@ModelAttribute("driver") driver Driver) { 
	    driverService.save(Driver);
	    return "redirect:/listDriver";
	}
	
	@GetMapping("/editDriver/{id}")
	public String editBus(@PathVariable("id") String id, Model model) {
	    try {
	        Optional<driver> driver = driverService.findById(id);
	        if (driver.isPresent()) {
	            model.addAttribute("driver", driver.get());
	            return "admin/driver/edit";
	        } else {
	            return "redirect:/listDriver"; 
	        }
	    } catch (Exception e) {
	        System.out.println("Error al obtener el conductor: " + e);
	        return "redirect:/listDriver";
	    }
	}
	
	@PostMapping("/updateDriver/{id}")
	public String updateBus(@PathVariable("id") String id, @ModelAttribute("driver") driver Driver, Model model) {
		 Optional<driver> busFind = driverService.findById(id);
		    if (busFind.isPresent()) {
		    	driver driverUpd = busFind.get(); 
		    	driverUpd.setDriverFirstName(Driver.getDriverFirstName());
		    	driverUpd.setDriverLastName(Driver.getDriverLastName());
		    	driverService.save(driverUpd);
		    }
	    return "redirect:/listDriver";
	}
	
	@GetMapping("/deleteDriver/{id}")
	public String deleteBus(@PathVariable("id") String id) {
	    try {
	        driverService.deleteById(id);
	    } catch (Exception e) {
	        System.out.println("Error al eliminar el bus: " + e);
	    }
	    return "redirect:/listDriver";
	}
}
