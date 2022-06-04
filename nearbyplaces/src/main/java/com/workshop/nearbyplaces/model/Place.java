package com.workshop.nearbyplaces.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<AddressComponent> addressComponents;

    private String adr_address;

    private String business_status;

    private String formatted_address;

    private String formatted_phone_number;

    @OneToOne
    private Geometry geometry;

    private String icon;

    private String icon_background_color;

    private String icon_mask_base_uri;

    private String international_phone_number;

    private String name;

    @OneToOne
    private PlaceOpeningHours opening_hours;

    @OneToMany
    private List<PlacePhoto> photos;

    private String place_id;

    @OneToOne
    private PlusCode plus_code;

    private Integer price_level;

    private Float rating;

    @OneToMany
    private List<PlaceReview> reviews;

    @ElementCollection
    @CollectionTable(name = "place_type", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "types")
    private List<String> types;

    private String url;

    private Long user_ratings_total;

    private Integer utc_offset;

    private String vicinity;

    private String website;

}
