package br.com.teste.springbootteste.acessomysql;

import org.springframework.data.repository.CrudRepository;

import br.com.teste.springbootteste.acessomysql.User;

public interface UserRepository extends CrudRepository<User, Integer> {



}
