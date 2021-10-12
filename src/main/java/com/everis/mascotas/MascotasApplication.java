package com.everis.mascotas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MascotasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MascotasApplication.class, args);
	}

	public void run(String... args) throws Exception {}

}
