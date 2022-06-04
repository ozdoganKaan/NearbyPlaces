package com.workshop.nearbyplaces.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PlaceOpeningHoursPeriod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne
    private PlaceOpeningHoursPeriodDetail open;

    @OneToOne
    private PlaceOpeningHoursPeriodDetail close;
}
