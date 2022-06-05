package com.workshop.nearbyplaces.repository;

import com.workshop.nearbyplaces.model.PlaceReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceReviewRepository extends JpaRepository<PlaceReview,Long> {
}
