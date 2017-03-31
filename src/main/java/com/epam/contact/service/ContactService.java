package com.epam.contact.service;

import com.epam.contact.domain.Contact;
import com.epam.contact.domain.User;

import java.util.List;

/**
 * Created by Yauheni_Malashchytsk on 3/27/2017.
 */
public interface ContactService {

    void addContact(Contact contact);

    List<Contact> getContactsForUser(User user);

    void removeContact(Integer id);

}
