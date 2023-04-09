package com.spring.data.jpa.sdjpahibernatedao.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NamedQueries({
        @NamedQuery(name = "author_find_all", query = "FROM Author"),
        @NamedQuery(name = "find_by_name", query = "FROM Author a WHERE a.firstName = :first_name and a.lastName = :last_name")
})
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
}
