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


    @GetMapping("/home")
    public String home(){
        return "home.html";
    }

    @GetMapping("/cadastro")
    public String cadastro(){
        return "cadastro.html";
    }

    @PostMapping  ("/envio")
    public String addNewUser(@RequestParam("nome") String nome, @RequestParam("email") String email){
        User n = new User();
        n.setNome(nome);
        n.setEmail(email);
        userRepository.save(n);

        return "home.html";
    }

    @GetMapping("/cadastroConcluido")
    public String error(){
        return "home.html";
    }



}
