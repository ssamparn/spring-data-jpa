package com.spring.sdjpaintro.repository;

import com.spring.sdjpaintro.domain.BookNatural;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookNaturalRepository extends JpaRepository<BookNatural, String> {

}
