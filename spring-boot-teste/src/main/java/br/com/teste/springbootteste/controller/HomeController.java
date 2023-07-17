package br.com.teste.springbootteste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "home.html";
    }

    @GetMapping("/cadastro")
    public String cadastro(){
        return "cadastro.html";
    }



}
