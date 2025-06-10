package com.rayannegsilva;

import com.rayannegsilva.model.Pessoa;
import com.rayannegsilva.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();

        // Termine de implementar o CRUD com Hibernate

        // === PERSIST ===
        try (Session session = sf.openSession()) {
            Transaction tx = session.beginTransaction();
            Pessoa p = new Pessoa();
            p.setNome("Seu nome");
            session.persist(p);
            tx.commit();
            System.out.println("ID gerado = " + p.getId());
        }

        // === LIST ===
        try (Session session = sf.openSession()) {
            List<Pessoa> todas = session.createQuery("FROM Pessoa", Pessoa.class).list();
            System.out.println("Todas as pessoas:");
            todas.forEach(System.out::println);
        }

        // === UPDATE ===

        // === DELETE ===

        // === FECHE A CONEXÃO ===
    }
}