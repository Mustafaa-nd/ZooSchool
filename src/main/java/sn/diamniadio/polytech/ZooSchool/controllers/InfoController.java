package sn.diamniadio.polytech.ZooSchool.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class InfoController {
    @RequestMapping("/infos")
    public String getInfos(){
        System.out.println("In getInfo --------------------->");
//        String infoPolytech = "Bienvenue sur la page d'Accueil de l'application du Polytech";
//
//        modelInfo.addAttribute("uneVariable", infoPolytech);
//
//

        return "infos";
    }
}
