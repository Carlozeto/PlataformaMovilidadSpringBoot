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
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.bus;
import com.example.demo.entities.parade;
import com.example.demo.entities.route;
import com.example.demo.entities.route_parade;
import com.example.demo.services.BusService;
import com.example.demo.services.ParadeService;
import com.example.demo.services.RouteParadeService;
import com.example.demo.services.RouteService;

@Controller
public class ParadeController {
	
	@Autowired
	public ParadeService paradeService;
	@Autowired
	public RouteService routeService;
	@Autowired
	public RouteParadeService routeParadeService;
	@Autowired
	public BusService busService;
	
	@GetMapping({"/searchBus"})
	public String searchParade(Model model) {
		try {
			List<parade> listParade = paradeService.findAll();
			model.addAttribute("parade", listParade);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "admin/parade/index";
	}
	
	@PostMapping("/searchRoutes")
	public String searchRoutes(@RequestParam("originParadeId") int originParadeId, 
	                           @RequestParam("destinationParadeId") int destinationParadeId, 
	                           Model model) {
	    try {
	        List<route> routes = routeService.findRoutesByParadeIds(originParadeId, destinationParadeId);
	        if (routes.isEmpty()) {
	            // Si no hay rutas, agrega un mensaje de error al modelo y retorna la vista de búsqueda
	            model.addAttribute("errorMessage", "No se encontraron rutas para las paradas seleccionadas.");
	            return searchParade(model); 
	        } else {
	            // Si hay rutas, agrega los datos al modelo y retorna la vista de resultados
	            Optional<parade> paradeOrigin = paradeService.findById(originParadeId);
	            Optional<parade> paradeDestination = paradeService.findById(destinationParadeId);
	            model.addAttribute("routes", routes);
	            model.addAttribute("origin", paradeOrigin);
	            model.addAttribute("destiny",paradeDestination);
	            return "admin/route/results";
	        }
	    } catch (Exception e) {
	        System.out.println("Error: " + e);
	    }
	    return "admin/route/results"; 
	}
	

}
