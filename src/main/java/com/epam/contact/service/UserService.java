package com.epam.contact.service;

import com.epam.contact.domain.DomainEntity;

/**
 * Created by Yauheni_Malashchytsk on 3/29/2017.
 */
public interface UserService<V extends DomainEntity> {

    V loginUser(String email, String password);

    V registerUser(String email, String login, String password);

}
