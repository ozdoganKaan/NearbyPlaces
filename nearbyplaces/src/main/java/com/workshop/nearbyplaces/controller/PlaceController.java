package com.workshop.nearbyplaces.controller;

import com.workshop.nearbyplaces.service.LocationParameterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/place")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class PlaceController {

    private final LocationParameterService locationParameterService;

    @GetMapping("/nearby")
    public void getNearbyPlaces(@RequestParam("lat") Double lat,
                                @RequestParam("lng") Double lng,
                                @RequestParam("radius") Double radius){
            locationParameterService.getNearbyPlaces(lat,lng,radius);
    }
}
