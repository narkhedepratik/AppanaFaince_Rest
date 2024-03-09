package com.appana_fainance.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AppanaFainaceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppanaFainaceEurekaServerApplication.class, args);
	}

}
