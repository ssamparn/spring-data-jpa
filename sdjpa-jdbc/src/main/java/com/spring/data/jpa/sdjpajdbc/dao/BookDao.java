package com.spring.data.jpa.sdjpajdbc.dao;

import com.spring.data.jpa.sdjpajdbc.domain.Book;

public interface BookDao {
    Book getById(Long id);

    Book findBookByTitle(String title);

    Book saveNewBook(Book book);

    Book updateBook(Book book);

    void deleteBookById(Long id);
}
