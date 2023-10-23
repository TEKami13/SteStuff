package com.example.jbademo.address;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(generator = "address_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "address_seq_gen", sequenceName = "address_seq", allocationSize = 1)
    private Long addressId;

    private String addressStreetName;

    private String addressCity;

    private String addressCountry;

    private int addressZipCode;

    private String addressState;

    private String addressCounty;
}
