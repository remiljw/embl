package com.example.ensembltableapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class EnsemblTableApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnsemblTableApiApplication.class, args);
	}

}
