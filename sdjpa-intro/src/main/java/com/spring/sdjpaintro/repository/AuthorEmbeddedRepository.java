package com.spring.sdjpaintro.repository;

import com.spring.sdjpaintro.domain.composite.AuthorEmbedded;
import com.spring.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorEmbeddedRepository extends JpaRepository<AuthorEmbedded, NameId> {

}
