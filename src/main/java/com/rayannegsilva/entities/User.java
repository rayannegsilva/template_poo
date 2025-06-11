package com.rayannegsilva.entities;

// TODO: Adicione as anotações do JPA para a classe ser mapeada para uma tabela
public class User {
    private Long id;
    private String name;
    private String email;

    public User() {}

    public User(String nome, String email) {
        setNome(nome);
        setEmail(email);
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String name) {
        if(name == null || name.trim().isEmpty()) {
            System.out.println("Nome não pode ser vazio.");
        }
        this.name = name;
    }

    public void setEmail (String email) {
        if(email == null || email.trim().isEmpty()) {
            System.out.println("Email não pode ser vazio.");
        }

        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}