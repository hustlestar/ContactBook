package com.epam.contact.service.impl;

import com.epam.contact.dao.ContactDAO;
import com.epam.contact.domain.Contact;
import com.epam.contact.domain.User;
import com.epam.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Yauheni_Malashchytsk on 3/27/2017.
 */
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDAO<Contact> contactDAO;

    @Override
    @Transactional
    public void addContact(Contact contact) {
        contactDAO.addContactForUser(contact);
    }

    @Override
    @Transactional
    public List<Contact> getContactsForUser(User user) {
        return contactDAO.getContactsOfUser(user);
    }

    @Override
    @Transactional
    public void removeContact(Integer id) {
        contactDAO.removeContact(id);
    }

}
