package com.workshop.nearbyplaces.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class LocationParameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double longitude;

    private double latitude;

    private double radius;

    //@ElementCollection
    //@CollectionTable(name = "place_list", joinColumns = @JoinColumn(name = "id"))
    //@Column(name = "place")
    @OneToMany
    private List<Place> place;

}
