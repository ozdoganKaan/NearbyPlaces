package com.workshop.nearbyplaces.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Geometry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private LatLngLiteral location;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "viewport_id", referencedColumnName = "id")
    private Bounds viewport;

    @OneToOne(mappedBy = "geometry")
    private Place place;


}
