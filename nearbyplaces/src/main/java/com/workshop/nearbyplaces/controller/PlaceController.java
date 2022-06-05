package com.workshop.nearbyplaces.controller;

import com.workshop.nearbyplaces.model.PlaceDTO;
import com.workshop.nearbyplaces.model.PlaceData;
import com.workshop.nearbyplaces.service.LocationRegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/place")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class PlaceController {

    private final LocationRegisterService locationRegisterService;

    @GetMapping("/nearby")
    public List<PlaceData> getNearbyPlaces(@RequestParam("lat") Double lat,
                                           @RequestParam("lng") Double lng,
                                           @RequestParam("radius") Double radius){
           return locationRegisterService.getNearbyPlaces(lat,lng,radius);
    }
}
