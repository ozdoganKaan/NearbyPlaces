package com.workshop.nearbyplaces.repository;

import com.workshop.nearbyplaces.model.LocationRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationRegisterRepository extends JpaRepository<LocationRegister, Long> {

    Optional<LocationRegister> getByLongitudeAndLatitudeAndRadius(Double longitude, Double latitude, Double radius);
}
