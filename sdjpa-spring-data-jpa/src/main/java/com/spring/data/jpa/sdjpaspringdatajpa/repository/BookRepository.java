package com.spring.data.jpa.sdjpaspringdatajpa.repository;

import java.util.Optional;
import java.util.stream.Stream;

import com.spring.data.jpa.sdjpaspringdatajpa.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findBookByTitle(String title);

    Book readByTitle(String title);

    @Nullable
    Book getByTitle(@Nullable String title);

    Stream<Book> findAllByTitleNotNull();
}
