package com.workshop.nearbyplaces.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PlusCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String global_code;

    private String compound_code;

    @OneToOne(mappedBy = "plus_code")
    private Place place;
}
