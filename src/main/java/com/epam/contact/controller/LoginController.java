package com.epam.contact.controller;

import com.epam.contact.domain.User;
import com.epam.contact.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by Yauheni_Malashchytsk on 3/29/2017.
 */
@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = {
            "/",
            "/index",
            "/home"
    })
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "email") String email,
                        @RequestParam(value = "password") String password,
                        HttpSession session,
                        ModelMap model) {
        User user = (User) userService.loginUser(email, password);
        //model.addAttribute("user", user);
        session.setAttribute("user", user);
        return "welcome";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam(value = "email") String email,
                           @RequestParam(value = "login") String login,
                           @RequestParam(value = "password") String password,
                           HttpSession session,
                           ModelMap model) {
        User user = (User) userService.registerUser(email, login, password);
        session.setAttribute("user", user);
        //model.addAttribute("user", user);
        return "welcome";
    }
}