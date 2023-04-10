package com.spring.data.jpa.sdjpaspringdatajpa.dao;

import java.util.List;

import com.spring.data.jpa.sdjpaspringdatajpa.domain.Author;
import org.springframework.data.domain.Pageable;

public interface AuthorDao {

    List<Author> findAllAuthorsByLastName(String lastname, Pageable pageable);

    Author getById(Long id);

    Author findAuthorByName(String firstName, String lastName);

    Author saveNewAuthor(Author author);

    Author updateAuthor(Author author);

    void deleteAuthorById(Long id);
}
