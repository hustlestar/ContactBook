package com.epam.contact.dao;

import com.epam.contact.domain.DomainEntity;

/**
 * Created by Yauheni_Malashchytsk on 3/29/2017.
 */
public interface UserDAO<V extends DomainEntity> {

    V loginUser(String email, String password);

    V registerUser(V v);

}
