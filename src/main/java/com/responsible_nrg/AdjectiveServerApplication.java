package com.responsible_nrg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdjectiveServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdjectiveServerApplication.class, args);
	}
}

