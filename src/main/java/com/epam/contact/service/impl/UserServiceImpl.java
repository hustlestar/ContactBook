package com.epam.contact.service.impl;

import com.epam.contact.dao.UserDAO;
import com.epam.contact.domain.User;
import com.epam.contact.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Yauheni_Malashchytsk on 3/29/2017.
 */
@Service
public class UserServiceImpl implements UserService<User> {

    @Autowired
    UserDAO<User> userDAO;

    @Override
    @Transactional
    public User loginUser(String email, String password) {
        return userDAO.loginUser(email, password);
    }

    @Override
    @Transactional
    public User registerUser(String email, String login, String password) {
        User user = new User(email, login, password);
        return userDAO.registerUser(user);
    }

}
