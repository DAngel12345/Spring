package com.home.pojos;

import lombok.*;

/**
 * Created by User on 10.04.2017.
 */
@AllArgsConstructor
@Getter
@Setter
public class Person implements IPerson{
    private String name;
    private IAddress address;

    public Person(){

    }

    public void getAddress() {
        System.out.println(address.getAddress());

    }
}
