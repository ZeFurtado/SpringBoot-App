package br.com.teste.springbootteste.controller;

import br.com.teste.springbootteste.acessomysql.User;
import br.com.teste.springbootteste.acessomysql.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/teste")
    public String teste(){
        return "teste.html";
    }


    @GetMapping("/home")
    public String home(){
        return "home.html";
    }

    @GetMapping("/cadastro")
    public String cadastro(){
        return "cadastro.html";
    }

    @PostMapping  ("/envio")
    public String addNewUser(){
        User n = new User();
        n.setNome("Volnir");
        n.setEmail("gmail.com");
        userRepository.save(n);

        return "cadastro.html";
    }



}
