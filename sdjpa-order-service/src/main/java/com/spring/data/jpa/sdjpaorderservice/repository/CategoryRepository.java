package com.spring.data.jpa.sdjpaorderservice.repository;

import com.spring.data.jpa.sdjpaorderservice.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}