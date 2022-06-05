package com.workshop.nearbyplaces.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Bounds {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "northeast_id", referencedColumnName = "id")
    private LatLngLiteral northeast;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "southwest_id", referencedColumnName = "id")
    private LatLngLiteral southwest;

    @OneToOne(mappedBy = "viewport")
    private Geometry geometry;
}
