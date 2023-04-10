package com.spring.data.jpa.sdjpaspringdatajpa.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.spring.data.jpa.sdjpaspringdatajpa.domain.Author;
import org.springframework.jdbc.core.RowMapper;

public class AuthorMapper implements RowMapper<Author> {

    @Override
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
        Author author = new Author();
        author.setId(rs.getLong("id"));
        author.setFirstName(rs.getString("first_name"));
        author.setLastName(rs.getString("last_name"));

        return author;
    }
}
