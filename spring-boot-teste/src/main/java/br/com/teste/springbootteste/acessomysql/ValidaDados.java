package br.com.teste.springbootteste.acessomysql;

import java.util.regex.*;
public class ValidaDados {

    public boolean nomeInvalido(String nome){

        String regex = "^[A-Za-z]\\\\w{5,29}$";

        for(int i = 0; i < nome.length(); i++){
            if(!Character.isAlphabetic(nome.charAt(i))){
                return true;
            }
        }

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(nome);

        return matcher.matches();

    }



}
