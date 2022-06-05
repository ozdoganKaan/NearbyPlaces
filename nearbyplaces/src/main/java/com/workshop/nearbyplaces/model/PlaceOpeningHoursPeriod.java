package com.workshop.nearbyplaces.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PlaceOpeningHoursPeriod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "open_id", referencedColumnName = "id")
    private PlaceOpeningHoursPeriodDetail open;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "close_id", referencedColumnName = "id")
    private PlaceOpeningHoursPeriodDetail close;

    @OneToOne(mappedBy = "periods")
    private PlaceOpeningHours placeOpeningHoursPeriods;


}
