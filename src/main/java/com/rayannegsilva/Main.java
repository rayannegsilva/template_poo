package com.rayannegsilva;

import com.rayannegsilva.model.Pessoa;
import com.rayannegsilva.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();

        // todo: Termine de implementar o CRUD com Hibernate e JPA

        // === PERSIST ===
        try (EntityManager em = emf.createEntityManager()) {
            EntityTransaction tx = em.getTransaction();
            tx.begin();

            Pessoa p = new Pessoa();
            p.setNome("João da Silva");
            em.persist(p);

            tx.commit();
            System.out.println("ID gerado = " + p.getId());
        }

        // === LIST ===
        try (EntityManager em = emf.createEntityManager()) {
            // A forma padrão JPA de criar uma query tipada
            TypedQuery<Pessoa> query = em.createQuery("SELECT p FROM Pessoa p", Pessoa.class);
            List<Pessoa> todas = query.getResultList(); // O método padrão é getResultList()

            System.out.println("Todas as pessoas:");
            todas.forEach(p -> System.out.println(" - " + p.getNome()));
        }

        // === UPDATE ===

        // === DELETE ===

        // === FECHE A CONEXÃO ===
    }
}