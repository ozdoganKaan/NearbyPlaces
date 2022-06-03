package com.workshop.nearbyplaces.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Data
public class LocationParameterDTO {


    private double longitude;

    private double latitude;

    private double radius;

}
