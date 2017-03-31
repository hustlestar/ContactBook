package com.epam.contact.controller;

import com.epam.contact.domain.Contact;
import com.epam.contact.domain.User;
import com.epam.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by Yauheni_Malashchytsk on 3/27/2017.
 */
@Controller
@SessionAttributes("user")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/contacts")
    public String listContacts(@ModelAttribute("user") User user, ModelMap model) {
        model.addAttribute("contactList", contactService.getContactsForUser(user));
        return "contacts";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("user") Contact contact,
                             BindingResult result) {

        contactService.addContact(contact);

        return "redirect:/index";
    }

    @RequestMapping("/delete/{contactId}")
    public String deleteContact(@PathVariable("contactId") Integer contactId) {

        contactService.removeContact(contactId);

        return "redirect:/index";
    }
}
