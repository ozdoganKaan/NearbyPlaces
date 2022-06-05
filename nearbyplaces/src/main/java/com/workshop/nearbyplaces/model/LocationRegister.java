package com.workshop.nearbyplaces.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class LocationRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double longitude;

    private double latitude;

    private double radius;

    @OneToMany(mappedBy = "locationRegister", cascade = CascadeType.ALL)
    private List<Place> places = new ArrayList<>();

}
