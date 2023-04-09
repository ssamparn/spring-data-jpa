package com.spring.data.jpa.sdjpajdbctemplate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.spring.data.jpa.sdjpajdbctemplate.domain.Book;
import org.springframework.jdbc.core.RowMapper;

public class BookMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setId(rs.getLong(1));
        book.setIsbn(rs.getString(2));
        book.setPublisher(rs.getString(3));
        book.setTitle(rs.getString(4));
        book.setAuthorId(rs.getLong(5));
        return book;
    }
}
