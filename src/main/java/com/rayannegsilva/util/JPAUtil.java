package com.rayannegsilva.util;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.SessionFactory;

public class JPAUtil {
    private static final String PERSISTENCE_UNIT_NAME = "";
    private static final EntityManagerFactory EMF = buildEntityManagerFactory();

    private static EntityManagerFactory buildEntityManagerFactory() {

        // TODO: construir o EntityManagerFactory
        return null;
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return EMF;
    }

    public static void shutdown() {
        if (EMF != null && EMF.isOpen()) {
            EMF.close();
        }
    }
}
