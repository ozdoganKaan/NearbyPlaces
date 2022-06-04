package com.workshop.nearbyplaces.model;

import javax.persistence.*;

@Entity
public class Geometry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private LatLngLiteral location;

    @OneToOne
    private Bounds viewport;
}
