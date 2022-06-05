package com.workshop.nearbyplaces.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class LatLngLiteral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double lat;

    private Double lng;

    @OneToOne(mappedBy = "location")
    private Geometry geometry;

    @OneToOne(mappedBy = "northeast")
    private Bounds northeast_bounds;

    @OneToOne(mappedBy = "southwest")
    private Bounds southwest_bounds;



}
