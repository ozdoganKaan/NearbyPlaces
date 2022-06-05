package com.workshop.nearbyplaces.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PlaceOpeningHoursPeriodDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer day;

    private String time;

    @OneToOne(mappedBy = "open")
    private PlaceOpeningHoursPeriod placeOpeningHoursPeriodOpen;

    @OneToOne(mappedBy = "close")
    private PlaceOpeningHoursPeriod placeOpeningHoursPeriodClose;

}
