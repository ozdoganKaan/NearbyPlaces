package com.workshop.nearbyplaces.repository;

import com.workshop.nearbyplaces.model.Bounds;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoundsRepository extends JpaRepository<Bounds,Long> {
}
