package com.workshop.nearbyplaces.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Place{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "place", cascade = CascadeType.ALL)
    private List<AddressComponent> addressComponents;

    private String adr_address;

    private String business_status;

    private String formatted_address;

    private String formatted_phone_number;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "geometry_id", referencedColumnName = "id")
    private Geometry geometry;

    private String icon;

    private String icon_background_color;

    private String icon_mask_base_uri;

    private String international_phone_number;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "opening_hours_id", referencedColumnName = "id")
    private PlaceOpeningHours opening_hours;

    @OneToMany(mappedBy = "place", cascade = CascadeType.ALL)
    private List<PlacePhoto> photos;

    private String place_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plus_code_id", referencedColumnName = "id")
    private PlusCode plus_code;

    private Integer price_level;

    private Float rating;

    @OneToMany(mappedBy = "place",cascade = CascadeType.ALL)
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

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "location_register_id")
    private LocationRegister locationRegister;
    

}
