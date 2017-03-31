package com.epam.contact;

import com.epam.contact.dao.ContactDAO;
import com.epam.contact.dao.UserDAO;
import com.epam.contact.domain.Contact;
import com.epam.contact.domain.User;
import com.epam.contact.service.ContactService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContactBookApplicationTests {

	@Autowired
	UserDAO userDAO;

    @Autowired
    ContactDAO<Contact> contactDAO;

    @Autowired
    ContactService contactService;

	@Test
    @Ignore
	public void contextLoads() {
		User user = (User) userDAO.loginUser("admin@mail.ru", "admin");
		Assert.assertEquals(user.getNickName(), "admin");
		Assert.assertEquals(user.getId(), new Integer(1));
		Assert.assertEquals(user.getEmail(), "admin@mail.ru");
	}

	@Test
    @Ignore
    public void getContactsOfUser(){
        List<Contact> contactList = contactDAO.getContactsOfUser((User) userDAO.loginUser("admin@mail.ru", "admin"));
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    @Test
    @Ignore
    public void addContactForUser(){
        User user = (User) userDAO.loginUser("admin@mail.ru", "admin");
        Contact contact = new Contact();
        contact.setUser(user);
        contact.setFirstname("jack");
        contact.setLastname("m");
        contact.setEmail("hustle@mail.ru");
        contact.setTelephone("7782178");
        contactService.addContact(contact);
    }

}
