package com.epam.contact.dao;

import com.epam.contact.domain.DomainEntity;
import com.epam.contact.domain.User;

import java.util.List;

/**
 * Created by Yauheni_Malashchytsk on 3/27/2017.
 */
public interface ContactDAO<V extends DomainEntity> {

    void addContactForUser(V v);

    List<V> getContactsOfUser(User user);

    void removeContact(Integer id);
}
