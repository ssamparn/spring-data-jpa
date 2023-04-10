package com.spring.data.jpa.sdjpaspringdatajpa.dao.jdbc;

import java.util.List;

import com.spring.data.jpa.sdjpaspringdatajpa.dao.AuthorDao;
import com.spring.data.jpa.sdjpaspringdatajpa.dao.mapper.AuthorMapper;
import com.spring.data.jpa.sdjpaspringdatajpa.domain.Author;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;

public class AuthorDaoJDBCTemplate implements AuthorDao {

    private final JdbcTemplate jdbcTemplate;

    public AuthorDaoJDBCTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Author> findAllAuthorsByLastName(String lastname, Pageable pageable) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT * FROM author WHERE last_name = ? ");

        if (pageable.getSort().getOrderFor("firstname") != null) {
            sb.append("order by first_name ").append(pageable.getSort()
                    .getOrderFor("firstname").getDirection().name());
        }

        sb.append(" limit ? offset ?");

        return jdbcTemplate.query(sb.toString(), getAuthorMapper(), lastname, pageable.getPageSize(), pageable.getOffset());
    }

    private AuthorMapper getAuthorMapper() {
        return new AuthorMapper();
    }

    @Override
    public Author getById(Long id) {
        return null;
    }

    @Override
    public Author findAuthorByName(String firstName, String lastName) {
        return null;
    }

    @Override
    public Author saveNewAuthor(Author author) {
        return null;
    }

    @Override
    public Author updateAuthor(Author author) {
        return null;
    }

    @Override
    public void deleteAuthorById(Long id) {

    }
}
