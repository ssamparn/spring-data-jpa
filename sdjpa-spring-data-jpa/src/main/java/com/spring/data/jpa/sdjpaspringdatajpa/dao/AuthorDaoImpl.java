package com.spring.data.jpa.sdjpaspringdatajpa.dao;

import com.spring.data.jpa.sdjpaspringdatajpa.domain.Author;
import com.spring.data.jpa.sdjpaspringdatajpa.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityNotFoundException;

@Component
public class AuthorDaoImpl implements AuthorDao {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorDaoImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author getById(Long id) {
        return authorRepository.getById(id);
    }

    @Override
    public Author findAuthorByName(String firstName, String lastName) {
        return authorRepository.findAuthorByFirstNameAndLastName(firstName, lastName)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Author saveNewAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Transactional
    @Override
    public Author updateAuthor(Author author) {
        Author foundAuthor = authorRepository.getById(author.getId());
        foundAuthor.setFirstName(author.getFirstName());
        foundAuthor.setLastName(author.getLastName());
        return authorRepository.save(foundAuthor);
    }

    @Override
    public void deleteAuthorById(Long id) {
        authorRepository.deleteById(id);
    }
}










