package com.spring.data.jpa.sdjpajdbc.repository;

import com.spring.data.jpa.sdjpajdbc.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
