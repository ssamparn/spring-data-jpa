package com.spring.data.jpa.sdjpaorderservice.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

import jakarta.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class Address {

    private String address;
    private String city;
    private String state;
    private String zipCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address1 = (Address) o;
        return Objects.equals(address, address1.address) && Objects.equals(city, address1.city) && Objects.equals(state, address1.state) && Objects.equals(zipCode, address1.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, city, state, zipCode);
    }
}
