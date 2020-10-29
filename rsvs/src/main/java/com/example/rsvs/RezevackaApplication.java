package com.example.rsvs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class RezevackaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RezevackaApplication.class, args);
	}

}
