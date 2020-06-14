package com.franchises;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FranchisesApplication {

	public static void main(String[] args) {
		
		// Customize Tomcat server port 
		SpringApplication app = new SpringApplication(FranchisesApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8081"));
        app.run(args);	
		
	}

}
