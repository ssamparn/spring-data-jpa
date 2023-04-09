package com.spring.data.jpa.sdjpaspringdatajpa;

import java.util.concurrent.atomic.AtomicInteger;

import com.spring.data.jpa.sdjpaspringdatajpa.domain.Book;
import com.spring.data.jpa.sdjpaspringdatajpa.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ActiveProfiles("local")
@DataJpaTest
@ComponentScan(basePackages = {"com.spring.data.jpa.sdjpaspringdatajpa"})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void testBookStream() {
        AtomicInteger count = new AtomicInteger();

        bookRepository.findAllByTitleNotNull().forEach(book -> count.incrementAndGet());

        assertThat(count.get()).isGreaterThan(5);
    }

    @Test
    void testEmptyResultException() {

        assertThrows(EmptyResultDataAccessException.class, () -> {
            Book book = bookRepository.readByTitle("foobar4");
        });
    }

    @Test
    void testNullParam() {
        assertNull(bookRepository.getByTitle(null));
    }

    @Test
    void testNoException() {

        assertNull(bookRepository.getByTitle("foo"));
    }
}
