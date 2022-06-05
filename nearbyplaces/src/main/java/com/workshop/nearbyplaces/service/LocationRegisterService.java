package com.workshop.nearbyplaces.service;

import com.workshop.nearbyplaces.model.*;
import com.workshop.nearbyplaces.repository.LocationRegisterRepository;
import com.workshop.nearbyplaces.repository.PlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LocationRegisterService {

    private final RestTemplate restTemplate;
    private final LocationRegisterRepository locationRegisterRepository;
    private final PlaceRepository placeRepository;


    @Value("${apiKey}")
    String apiKey;

    @Transactional
    public List<PlaceData> getNearbyPlaces(Double lat, Double lng, Double radius) {

        Optional<LocationRegister> locationParameter = locationRegisterRepository.getByLongitudeAndLatitudeAndRadius(lng, lat, radius);

        if (locationParameter.isPresent()) {

           return placeRepository.getPlaceListByLocationId(locationParameter.get().getId());
        }

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        HttpEntity<Object> entity = new HttpEntity<>(null, headers);

        ResponseEntity<ResponseHolder> responseHolderResponseEntity = restTemplate.exchange("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=" + lat + "," + lng + "&radius=" + radius + "&key=" + apiKey, HttpMethod.GET, entity, ResponseHolder.class);

        ResponseHolder responseHolder = responseHolderResponseEntity.getBody();

        if (responseHolder.getResults() != null) {


            LocationRegister locationRegister = new LocationRegister();
            locationRegister.setLongitude(lng);
            locationRegister.setLatitude(lat);
            locationRegister.setRadius(radius);
            locationRegister.setPlaces(responseHolder.getResults());
            LocationRegister savedLocationRegister = locationRegisterRepository.save(locationRegister);


            responseHolder.getResults().forEach(result -> result.setLocationRegister(savedLocationRegister));

            placeRepository.saveAll(responseHolder.getResults());

            return placeRepository.getPlaceListByLocationId(savedLocationRegister.getId());

        }
        return null;
    }
}
