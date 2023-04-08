package com.spring.sdjpaintro.domain.composite;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(NameId.class)
@Getter
@Setter
public class AuthorComposite {

    @Id
    private String firstName;

    @Id
    private String lastName;

    private String country;
}
