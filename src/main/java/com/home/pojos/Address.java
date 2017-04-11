package com.home.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by User on 10.04.2017.
 */
@Data
@AllArgsConstructor
public class Address implements IAddress {
    private String street;


    public Address() {

    }

    public String getAddress() {
        return "Adress: " + street;
    }
}
