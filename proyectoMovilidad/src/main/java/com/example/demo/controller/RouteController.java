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

import com.example.demo.entities.route;
import com.example.demo.services.RouteService;

@Controller
public class RouteController {

    @Autowired
    public RouteService routeService;

    @GetMapping("/listRoute")
    public String listRoute(Model model) {
        try {
            List<route> listRoute = routeService.findAll();
            model.addAttribute("route", listRoute);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return "admin/route/index";
    }

    @GetMapping("/formRoute")
    public String mostrarFormulario(Model model) {
        route route1 = new route();
        model.addAttribute("route", route1);
        return "admin/route/add";
    }

    @PostMapping("/addRoute")
    public String addRoute(@ModelAttribute("route") route Route) {
        routeService.save(Route);
        return "redirect:/listRoute";
    }

    @GetMapping("/editRoute/{id}")
    public String editRoute(@PathVariable("id") int id, Model model) {
        try {
            Optional<route> route = routeService.findById(id);
            if (route.isPresent()) {
                model.addAttribute("route", route.get());
                return "admin/route/edit";
            } else {
                return "redirect:/listRoute";
            }
        } catch (Exception e) {
            System.out.println("Error al obtener la ruta: " + e);
            return "redirect:/listRoute";
        }
    }

    @PostMapping("/updateRoute/{id}")
    public String updateRoute(@PathVariable("id") int id, @ModelAttribute("route") route Route, Model model) {
        Optional<route> routeFind = routeService.findById(id);
        if (routeFind.isPresent()) {
            route routeUpd = routeFind.get();
            routeUpd.setRouteName(Route.getRouteName());
            routeUpd.setRouteBoard(Route.getRouteBoard());
            routeUpd.setRouteCol(Route.getRouteCol());
            routeUpd.setRouteRouteAreaId(Route.getRouteRouteAreaId());
            routeService.save(routeUpd);
        }
        return "redirect:/listRoute";
    }

    @GetMapping("/deleteRoute/{id}")
    public String deleteRoute(@PathVariable("id") int id) {
        try {
            routeService.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error al eliminar la ruta: " + e);
        }
        return "redirect:/listRoute";
    }
}