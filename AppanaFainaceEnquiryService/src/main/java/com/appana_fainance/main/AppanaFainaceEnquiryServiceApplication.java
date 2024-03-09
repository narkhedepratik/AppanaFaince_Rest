package com.appana_fainance.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class AppanaFainaceEnquiryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppanaFainaceEnquiryServiceApplication.class, args);
	}

}
