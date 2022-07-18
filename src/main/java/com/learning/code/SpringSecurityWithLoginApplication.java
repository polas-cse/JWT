package com.learning.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringSecurityWithLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityWithLoginApplication.class, args);
	}

}
