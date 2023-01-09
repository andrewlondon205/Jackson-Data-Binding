package com.luv2code.jackson.json.demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
}
