package br.ufrj.coppe.laceo.AppLACEO.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        System.out.println("realmente cheguei no index");

        return "Olá, você chegou na parte inicial do aplicativos do LACEO";
    }

}
