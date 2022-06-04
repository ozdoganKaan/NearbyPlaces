package com.workshop.nearbyplaces.repository;

import com.workshop.nearbyplaces.model.LocationParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationParameterRepository extends JpaRepository<LocationParameter, Long> {

    Optional<LocationParameter> getByLongitudeAndLatitudeAndRadius(Double longitude, Double latitude, Double radius);
}
