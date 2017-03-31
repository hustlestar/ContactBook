package com.epam.contact.dao.impl;

import com.epam.contact.dao.ContactDAO;
import com.epam.contact.domain.Contact;
import com.epam.contact.domain.User;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Yauheni_Malashchytsk on 3/27/2017.
 */
@SuppressWarnings("ALL")
@Repository
public class ContactDAOImpl implements ContactDAO<Contact> {

    private static final String USER = "user";
    private static final String GET_CONTACTS_FOR_USER = "FROM Contact C WHERE C.user=:user";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addContactForUser(Contact contact) {
        entityManager.persist(contact);
    }

    @Override
    public List<Contact> getContactsOfUser(User user) {
        return entityManager.createQuery(GET_CONTACTS_FOR_USER).
                setParameter(USER, user).
                getResultList();
    }

    @Override
    public void removeContact(Integer id) {
        Contact contact = (Contact) entityManager.find(Contact.class, id);
        if (null != contact) {
            entityManager.remove(contact);
        }
    }
}
