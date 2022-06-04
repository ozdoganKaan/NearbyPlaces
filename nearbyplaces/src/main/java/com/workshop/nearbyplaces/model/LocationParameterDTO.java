package com.workshop.nearbyplaces.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class LocationParameterDTO {

    @Id
    private Long id;

    private double longitude;

    private double latitude;

    private double radius;

}
