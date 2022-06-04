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

    @ElementCollection
    @CollectionTable(name = "place_photo_reference", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "photo_reference")
    private List<String> photo_reference;

    private Integer width;
}
