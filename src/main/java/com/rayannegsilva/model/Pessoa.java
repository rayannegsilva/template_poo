package com.rayannegsilva.model;

// TODO: Adicione as anotações do JPA
public class Pessoa {

    private Long id;
    private String nome;

    public Pessoa() {}

    public Pessoa(String nome) {
        setNome(nome);
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome não pode ficar em branco!");
            return;
        }

        this.nome = nome;
    }

}
