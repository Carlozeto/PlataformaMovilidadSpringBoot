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

import com.example.demo.entities.enterprise;
import com.example.demo.services.EnterpriseService;

@Controller
public class EnterpriseController {

    @Autowired
    public EnterpriseService enterpriseService;

    @GetMapping("/listEnterprise")
    public String listEnterprise(Model model) {
        try {
            List<enterprise> listEnterprise = enterpriseService.findAll();
            model.addAttribute("enterprise", listEnterprise);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return "admin/enterprise/index";
    }

    @GetMapping("/formEnterprise")
    public String mostrarFormulario(Model model) {
        enterprise enterprise1 = new enterprise();
        model.addAttribute("enterprise", enterprise1);
        return "admin/enterprise/add";
    }

    @PostMapping("/addEnterprise")
    public String addEnterprise(@ModelAttribute("enterprise") enterprise Enterprise) {
        enterpriseService.save(Enterprise);
        return "redirect:/listEnterprise";
    }

    @GetMapping("/editEnterprise/{id}")
    public String editEnterprise(@PathVariable("id") int id, Model model) {
        try {
            Optional<enterprise> enterprise = enterpriseService.findById(id);
            if (enterprise.isPresent()) {
                model.addAttribute("enterprise", enterprise.get());
                return "admin/enterprise/edit";
            } else {
                return "redirect:/listEnterprise";
            }
        } catch (Exception e) {
            System.out.println("Error al obtener la empresa: " + e);
            return "redirect:/listEnterprise";
        }
    }

    @PostMapping("/updateEnterprise/{id}")
    public String updateEnterprise(@PathVariable("id") int id, @ModelAttribute("enterprise") enterprise Enterprise, Model model) {
        Optional<enterprise> enterpriseFind = enterpriseService.findById(id);
        if (enterpriseFind.isPresent()) {
            enterprise enterpriseUpd = enterpriseFind.get();
            enterpriseUpd.setEnterpriseName(Enterprise.getEnterpriseName());
            enterpriseUpd.setEnterpriseNIT(Enterprise.getEnterpriseNIT());
            enterpriseService.save(enterpriseUpd);
        }
        return "redirect:/listEnterprise";
    }

    @GetMapping("/deleteEnterprise/{id}")
    public String deleteEnterprise(@PathVariable("id") int id) {
        try {
            enterpriseService.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error al eliminar la empresa: " + e);
        }
        return "redirect:/listEnterprise";
    }
}