package com.example.register2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Register2Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Register2Application.class).run(args);
	}
}
