package br.com.teste.springbootteste.acessomysql;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
