package com.workshop.nearbyplaces.service;

import com.workshop.nearbyplaces.model.LocationParameter;
import com.workshop.nearbyplaces.model.ResponseHolder;
import com.workshop.nearbyplaces.repository.LocationParameterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LocationParameterService {

    private final RestTemplate restTemplate;
    private final LocationParameterRepository locationParameterRepository;
    private final

    @Value("${apiKey}")
    String apiKey;

    public void getNearbyPlaces(Double lat,Double lng,Double radius){

        Optional<LocationParameter> locationParameter=locationParameterRepository.getByLongitudeAndLatitudeAndRadius(lng,lat,radius);

        if(locationParameter.isPresent()){
            //return locationParameter;
        }

        ResponseEntity<ResponseHolder> responseHolderResponseEntity = restTemplate.getForEntity("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+lat+","+lng+"&radius="+radius+"&key="+apiKey,ResponseHolder.class);

        ResponseHolder responseHolder=responseHolderResponseEntity.getBody();



    }
}
