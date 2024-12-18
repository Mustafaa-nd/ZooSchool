package sn.diamniadio.polytech.ZooSchool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String getHome(Model model){
        System.out.println("In getHome --------------------->");
        String accueilPolytech = "Bienvenue sur la page d'Accueil de l'application du Polytech";
        String white = "background-color:white";

        model.addAttribute("uneVariable", accueilPolytech);
        model.addAttribute("color", white);

        return "home";
    }

    @PostMapping
    public String postHome(Model model){
        System.out.println("In getHome --------------------->");
        String accueilPolytech = "Bienvenue sur la page d'Accueil de l'application du Polytech";
        String red = "background-color:red";

        model.addAttribute("uneVariable", accueilPolytech);
        model.addAttribute("color", red);

        return "home";
    }
}
