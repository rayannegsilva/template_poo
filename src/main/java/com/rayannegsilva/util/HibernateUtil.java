package com.rayannegsilva.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory SF = buildSessionFactory();

    public static SessionFactory buildSessionFactory() {
        // TODO: ler o hibernate.cfg.xml e construir o SessionFactory,
        //  usando new Configuration().configure().buildSessionFactory()
        return null;
    }

    public static SessionFactory getSessionFactory() {
        return SF;
    }
    public static void shutdown() {
        SF.close();
    }
}
