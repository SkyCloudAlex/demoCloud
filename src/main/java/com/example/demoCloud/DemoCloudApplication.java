package com.example.demoCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoCloudApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoCloudApplication.class, args);
		new SpringApplicationBuilder(DemoCloudApplication.class).web(true).run(args);
	}
}
