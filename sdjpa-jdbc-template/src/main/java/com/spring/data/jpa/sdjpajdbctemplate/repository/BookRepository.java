package com.spring.data.jpa.sdjpajdbctemplate.repository;

import com.spring.data.jpa.sdjpajdbctemplate.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
