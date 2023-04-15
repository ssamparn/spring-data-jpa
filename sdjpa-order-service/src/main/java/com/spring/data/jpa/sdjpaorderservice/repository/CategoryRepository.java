package com.spring.data.jpa.sdjpaorderservice.repository;

import com.spring.data.jpa.sdjpaorderservice.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}