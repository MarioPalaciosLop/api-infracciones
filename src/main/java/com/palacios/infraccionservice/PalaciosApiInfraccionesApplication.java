package com.palacios.infraccionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PalaciosApiInfraccionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalaciosApiInfraccionesApplication.class, args);
	}

}
