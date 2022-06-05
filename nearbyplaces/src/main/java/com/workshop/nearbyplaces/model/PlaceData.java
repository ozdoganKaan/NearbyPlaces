package com.workshop.nearbyplaces.model;

public interface PlaceData {

    String getPlaceName();

    String getPlaceId();

    Float getPlaceRating();

    Long getPlaceUserRatingTotal();

    String getPlaceVicinity();

    Double getPlaceLatitude();

    Double getPlaceLongitude();
}
