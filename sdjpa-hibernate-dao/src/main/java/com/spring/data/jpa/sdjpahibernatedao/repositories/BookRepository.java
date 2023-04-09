package com.spring.data.jpa.sdjpahibernatedao.repositories;

import com.spring.data.jpa.sdjpahibernatedao.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
