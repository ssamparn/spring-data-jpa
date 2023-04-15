package com.spring.data.jpa.sdjpaorderservice.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
@Getter
@Setter
public class Customer extends BaseEntity {

    private String customerName;

    @Embedded
    private Address address;

    private String phone;
    private String email;

    @OneToMany(mappedBy = "customer")
    private Set<OrderHeader> orders = new LinkedHashSet<>();
}
