package com.workshop.nearbyplaces.repository;

import com.workshop.nearbyplaces.model.PlacePhoto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacePhotoRepository extends JpaRepository<PlacePhoto,Long> {
}
