package com.workshop.nearbyplaces.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class PlacePhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer height;

    @ElementCollection
    @CollectionTable(name = "place_photo_html_attributions", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "html_attributions")
    private List<String> html_attributions;

    private String photo_reference;

    private Integer width;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "place_id")
    private Place place;
}
