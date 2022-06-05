package com.workshop.nearbyplaces.repository;

import com.workshop.nearbyplaces.model.AddressComponent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressComponentRepository extends JpaRepository<AddressComponent,Long> {
}
