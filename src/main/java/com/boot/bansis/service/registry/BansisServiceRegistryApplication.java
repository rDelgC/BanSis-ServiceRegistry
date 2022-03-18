package com.boot.bansis.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BansisServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BansisServiceRegistryApplication.class, args);
	}

}
