package com.masters.location.plantlocation;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@SpringBootApplication
//@ComponentScan(basePackages={"com.masters.location.plantlocation.Controller"}) //From package above, so that controller can see and access this file
@EnableEurekaClient //Letting this service know it a client of service discovery, making it explicit
public class PlantLocationApplication {

    private static final Logger LOG = Logger.getLogger(PlantLocationApplication.class.getName());

    public static void main(String[] args) {
		SpringApplication.run(PlantLocationApplication.class, args);

	}

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
