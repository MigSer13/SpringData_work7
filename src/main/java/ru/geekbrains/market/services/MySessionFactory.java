package ru.geekbrains.market.services;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySessionFactory {
    private SessionFactory sessionFactory;
    private String pathToConfig;

    public MySessionFactory() {
        this.pathToConfig = pathToConfig;
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml").buildSessionFactory();
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
