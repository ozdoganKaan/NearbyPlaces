package com.workshop.nearbyplaces.repository;

import com.workshop.nearbyplaces.model.Geometry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeometryRepository extends JpaRepository<Geometry,Long> {
}
