package com.recbuddy.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class RecbuddyApiGatewayMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecbuddyApiGatewayMicroserviceApplication.class, args);
	}
}
