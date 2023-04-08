package com.spring.sdjpaintro.repository;

import java.util.UUID;

import com.spring.sdjpaintro.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, UUID> {

}
