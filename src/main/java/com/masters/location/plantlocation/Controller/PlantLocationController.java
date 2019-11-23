package com.masters.location.plantlocation.Controller;

import com.masters.location.plantlocation.Models.PlantLocation;
import com.masters.location.plantlocation.Repository.PlantLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class PlantLocationController {

    @Autowired
    PlantLocationRepository plantlocation;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public String location(){
        String url = "http://power-plant-location/location";
            return restTemplate.getForObject(url, String.class);
    }

    private static final Logger LOG = Logger.getLogger(PlantLocationController.class.getName());

    @GetMapping("/location") //get all details
    public List<PlantLocation> getAllPlants() {
        LOG.log(Level.INFO, "Index API is calling");
        return plantlocation.findAll();
    }
}
