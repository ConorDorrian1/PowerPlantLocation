package com.masters.location.plantlocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.masters.location.plantlocation.Controller"}) //From package above, so that controller can see and access this file
public class PlantLocationApplication1 {

	public static void main(String[] args) {
		SpringApplication.run(PlantLocationApplication1.class, args);
	}

}
