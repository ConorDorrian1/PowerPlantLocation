package com.masters.location.plantlocation.Controller;

import com.masters.location.plantlocation.Models.PlantLocation;
import com.masters.location.plantlocation.Repository.PlantLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlantLocationController {

    @Autowired
    PlantLocationRepository plantlocation;

    @GetMapping("/location") //get all details
    public List<PlantLocation> getAllPlants() {
        return plantlocation.findAll();
    }
}
