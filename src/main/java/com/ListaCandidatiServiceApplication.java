package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ListaCandidatiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaCandidatiServiceApplication.class, args);
	}

}
