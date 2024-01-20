package com.ramjava;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class Main {
    public static void main(String[] args) {
        //Environment
        // Configuration
        var configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Song.class);

        // Create a Session Factory (datasource)
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // Hibernate helper class
        Session session = sessionFactory.openSession();

        var song1 = new Song();
        song1.setId(1);
        song1.setSongTitle("Let The N****** Kill Each Other");
        song1.setBand("Achtung Juden");

        // Save to database
        session.beginTransaction();
        session.save(song1);
        session.getTransaction().commit();
        System.out.println("Song saved...");
    }
}