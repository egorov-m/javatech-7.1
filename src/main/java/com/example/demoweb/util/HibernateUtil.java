package com.example.demoweb.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.demoweb.model.User;

public class HibernateUtil {
    private static SessionFactory factory;

    public static synchronized SessionFactory getSessionFactory() {
        if (factory == null) {
            factory = new Configuration()
                    .configure("/hibernate.cfg.xml")
                    .addAnnotatedClass(User.class)
                    .buildSessionFactory();
        }

        return factory;
    }
}
