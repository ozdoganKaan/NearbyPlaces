package com.workshop.nearbyplaces.model;

import javax.persistence.*;

@Entity
public class Bounds {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private LatLngLiteral northeast;

    @OneToOne
    private LatLngLiteral southwest;
}
