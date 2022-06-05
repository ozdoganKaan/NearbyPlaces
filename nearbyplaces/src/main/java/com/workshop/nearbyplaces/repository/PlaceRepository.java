package com.workshop.nearbyplaces.repository;

import com.workshop.nearbyplaces.model.Place;
import com.workshop.nearbyplaces.model.PlaceData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaceRepository extends JpaRepository<Place,Long> {

    @Query(value = "SELECT " +
            "p.name as placeName," +
            "p.place_id as placeId, " +
            "p.rating as placeRating, " +
            "p.user_ratings_total as placeUserRatingTotal, " +
            "p.vicinity as placeVicinity, " +
            "lll.lat as placeLatitude, "+
            "lll.lng as placeLongitude "+
            "from place as p inner join geometry as g on p.geometry_id = g.id inner join lat_lng_literal lll on g.location_id = lll.id " +
            " where p.location_register_id=:location_id",nativeQuery = true)
    List<PlaceData> getPlaceListByLocationId(@Param("location_id") Long location_id);
}
