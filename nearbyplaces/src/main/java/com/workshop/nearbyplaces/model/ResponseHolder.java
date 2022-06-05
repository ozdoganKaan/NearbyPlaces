package com.workshop.nearbyplaces.model;

import lombok.Data;

import java.util.List;


@Data
public class ResponseHolder {

    private List<String> html_attributions;

    private List<Place> results;

    private String status;
}
