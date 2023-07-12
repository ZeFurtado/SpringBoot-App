package com.example.cardapio.book;

import jakarta.persistence.*;

@Table(name = "livros")
@Entity(name = "livros")
public class Book {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String autores;
    private int unit;




}
