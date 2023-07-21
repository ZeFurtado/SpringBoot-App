package br.com.teste.springbootteste.acessomysql;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String nome;
    private String email;

    private String cpf;

    private char sexo;

    private String nomeSocial;

    private String dataDeNasc;

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

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getDataDeNasc() {
        return dataDeNasc;
    }

    public void setDataDeNasc(String dataDeNasc) {
        this.dataDeNasc = dataDeNasc;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nome: " + this.nome + "\n");
        stringBuilder.append("Email: " + this.email + "\n");

        return stringBuilder.toString();
    }
}
