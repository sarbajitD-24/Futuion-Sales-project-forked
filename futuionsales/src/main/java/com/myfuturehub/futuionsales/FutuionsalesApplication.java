package com.myfuturehub.futuionsales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FutuionsalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FutuionsalesApplication.class, args);
	}

}
