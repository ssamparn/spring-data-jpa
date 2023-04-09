package com.spring.data.jpa.sdjpaspringdatajpa.repository;

import java.util.Optional;

import com.spring.data.jpa.sdjpaspringdatajpa.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findAuthorByFirstNameAndLastName(String firstName, String lastName);
}
