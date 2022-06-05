package com.workshop.nearbyplaces.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class PlaceOpeningHours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean open_now;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "periods_id", referencedColumnName = "id")
    private PlaceOpeningHoursPeriod periods;

    @ElementCollection
    @CollectionTable(name = "place_opening_hours_weekday_text", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "weekday_text")
    private List<String> weekday_text;


    @OneToOne(mappedBy = "opening_hours")
    private Place place;
}
