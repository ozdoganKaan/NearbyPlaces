package com.workshop.nearbyplaces.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class AddressComponent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String long_name;

    private String short_name;

    @ElementCollection
    @CollectionTable(name = "ac_type", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "types")
   private List<String> types;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "place_id")
    private Place place;
}
