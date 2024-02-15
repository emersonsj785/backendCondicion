package com.reto02.microservicios.condicion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviciosCondicionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosCondicionApplication.class, args);
	}

}
