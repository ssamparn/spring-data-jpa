package com.spring.data.jpa.sdjpajdbc.repository;

import com.spring.data.jpa.sdjpajdbc.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
