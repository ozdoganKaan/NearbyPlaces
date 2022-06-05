package com.workshop.nearbyplaces.repository;

import com.workshop.nearbyplaces.model.LatLngLiteral;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LatLngLiteralRepository extends JpaRepository<LatLngLiteral,Long> {
}
