package com.spring.data.jpa.sdjpaspringdatajpa.dao;

import com.spring.data.jpa.sdjpaspringdatajpa.domain.Book;

public interface BookDao {
    
    Book getById(Long id);

    Book findBookByTitle(String title);

    Book saveNewBook(Book book);

    Book updateBook(Book book);

    void deleteBookById(Long id);

}
