package com.workshop.nearbyplaces.repository;

import com.workshop.nearbyplaces.model.LocationParameterDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationParameterRepository extends JpaRepository<LocationParameterDTO, Long> {
}
