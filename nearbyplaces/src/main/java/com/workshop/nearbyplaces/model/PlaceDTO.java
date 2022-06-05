package com.workshop.nearbyplaces.model;

import lombok.Data;

import java.util.List;

@Data
public class PlaceDTO{


    private List<AddressComponent> addressComponents;

    private String adr_address;

    private String business_status;

    private String formatted_address;

    private String formatted_phone_number;

    private Geometry geometryDTO;

    private String icon;

    private String icon_background_color;

    private String icon_mask_base_uri;

    private String international_phone_number;

    private String name;

    private PlaceOpeningHours opening_hours;

    private List<PlacePhoto> photos;

    private String place_id;

    private PlusCode plus_code;

    private Integer price_level;

    private Float rating;

    private List<PlaceReview> reviews;

    private List<String> types;

    private String url;

    private Long user_ratings_total;

    private Integer utc_offset;

    private String vicinity;

    private String website;

}
