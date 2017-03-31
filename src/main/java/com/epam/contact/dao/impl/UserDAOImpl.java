package com.epam.contact.dao.impl;

import com.epam.contact.dao.UserDAO;
import com.epam.contact.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Yauheni_Malashchytsk on 3/29/2017.
 */
@SuppressWarnings("ALL")
@Repository
public class UserDAOImpl implements UserDAO<User> {

    private static final String LOGIN_USER = "FROM User U WHERE U.email=:email AND U.password=:password";
    private static final String EMAIL = "email";
    private static final String PASSWORD = "password";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User loginUser(String email, String password) {
        return (User) entityManager.createQuery(LOGIN_USER).
                setParameter(EMAIL, email).
                setParameter(PASSWORD, password).
                getSingleResult();
    }

    @Override
    public User registerUser(User user) {
        entityManager.persist(user);
        return user;
    }
}
