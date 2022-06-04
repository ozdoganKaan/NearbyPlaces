package com.workshop.nearbyplaces.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class LocationParameterService {

    private final RestTemplate restTemplate;

    @Value("${apiKey}")
    String apiKey;

    public void getNearbyPlaces(Double lat,Double lng,Double radius){
        restTemplate.getForEntity("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+lat+","+lng+"&radius="+radius+"&key="+apiKey,String.class);

    }
}
