package se.davand.config;

import org.hibernate.SessionFactory;

public interface DatabaseConnection {
    SessionFactory getSessionFactory();
}