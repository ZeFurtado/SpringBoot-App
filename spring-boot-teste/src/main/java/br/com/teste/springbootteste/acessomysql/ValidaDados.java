package br.com.teste.springbootteste.acessomysql;

import java.util.regex.*;
public class ValidaDados {

    public boolean nomeInvalido(String nome){

        String regex = "^[A-Za-z]\\w{5,29}$";

        Pattern pattern = Pattern.compile(regex);

        return true;

    }



}
