package com.workshop.nearbyplaces.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlaceReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String author_name;

    private Integer rating;

    private String relative_time_description;

    private Integer time;

    private String author_url;

    private String language;

    private String profile_photo_url;

    private String text;
}
