package com.spring.data.jpa.sdjpajdbctemplate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.spring.data.jpa.sdjpajdbctemplate.domain.Author;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class AuthorExtractor implements ResultSetExtractor<Author> {
    @Override
    public Author extractData(ResultSet rs) throws SQLException, DataAccessException {
        rs.next();

        return new AuthorMapper().mapRow(rs, 0);
    }
}
