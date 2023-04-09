package com.spring.data.jpa.sdjpaspringdatajpa.dao;

import com.spring.data.jpa.sdjpaspringdatajpa.domain.Author;

public interface AuthorDao {
    Author getById(Long id);

    Author findAuthorByName(String firstName, String lastName);

    Author saveNewAuthor(Author author);

    Author updateAuthor(Author author);

    void deleteAuthorById(Long id);
}
