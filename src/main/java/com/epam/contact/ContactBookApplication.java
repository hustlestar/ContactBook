package com.epam.contact;

import com.epam.contact.config.DatabaseConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class<?>[] {ContactBookApplication.class, DatabaseConfig.class}, args);
	}

}
