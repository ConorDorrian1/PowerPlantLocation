package com.masters.location.plantlocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages={"com.masters.location.plantlocation.Controller"}) //From package above, so that controller can see and access this file
@EnableEurekaClient //Letting this service know it a client of service discovery, making it explicit
public class PlantLocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantLocationApplication.class, args);
	}

}
