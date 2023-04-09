package com.spring.data.jpa.sdjpahibernatedao.repositories;

import com.spring.data.jpa.sdjpahibernatedao.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
