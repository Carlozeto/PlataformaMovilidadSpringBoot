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

import com.example.demo.entities.route_parade;
import com.example.demo.services.RouteParadeService;

@Controller
public class RouteParadeController {

    @Autowired
    public RouteParadeService routeParadeService;

    @GetMapping("/listRouteParade")
    public String listRouteParade(Model model) {
        try {
            List<route_parade> listRouteParade = routeParadeService.findAll();
            model.addAttribute("routeParade", listRouteParade);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return "admin/routeParade/index";
    }

    @GetMapping("/formRouteParade")
    public String mostrarFormulario(Model model) {
        route_parade routeParade1 = new route_parade();
        model.addAttribute("routeParade", routeParade1);
        return "admin/routeParade/add";
    }

    @PostMapping("/addRouteParade")
    public String addRouteParade(@ModelAttribute("routeParade") route_parade RouteParade) {
        routeParadeService.save(RouteParade);
        return "redirect:/listRouteParade";
    }

    @GetMapping("/editRouteParade/{id}")
    public String editRouteParade(@PathVariable("id") int id, Model model) {
        try {
            Optional<route_parade> routeParade = routeParadeService.findById(id);
            if (routeParade.isPresent()) {
                model.addAttribute("routeParade", routeParade.get());
                return "admin/routeParade/edit";
            } else {
                return "redirect:/listRouteParade";
            }
        } catch (Exception e) {
            System.out.println("Error al obtener la relación ruta-parada: " + e);
            return "redirect:/listRouteParade";
        }
    }

    @PostMapping("/updateRouteParade/{id}")
    public String updateRouteParade(@PathVariable("id") int id, @ModelAttribute("routeParade") route_parade RouteParade, Model model) {
        Optional<route_parade> routeParadeFind = routeParadeService.findById(id);
        if (routeParadeFind.isPresent()) {
            route_parade routeParadeUpd = routeParadeFind.get();
            routeParadeUpd.setRouteId(RouteParade.getRouteId());
            routeParadeUpd.setParadeId(RouteParade.getParadeId());
            routeParadeService.save(routeParadeUpd);
        }
        return "redirect:/listRouteParade";
    }

    @GetMapping("/deleteRouteParade/{id}")
    public String deleteRouteParade(@PathVariable("id") int id) {
        try {
            routeParadeService.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error al eliminar la relación ruta-parada: " + e);
        }
        return "redirect:/listRouteParade";
    }
}
