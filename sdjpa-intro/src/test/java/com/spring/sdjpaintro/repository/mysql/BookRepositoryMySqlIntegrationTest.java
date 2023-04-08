package com.spring.sdjpaintro.repository.mysql;

import com.spring.sdjpaintro.domain.BookNatural;
import com.spring.sdjpaintro.repository.BookNaturalRepository;
import com.spring.sdjpaintro.repository.BookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ActiveProfiles("local")
@DataJpaTest
@ComponentScan(basePackages = {"com.spring.sdjpaintro.bootstrap"})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookRepositoryMySqlIntegrationTest {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookNaturalRepository bookNaturalRepository;

    @Test
    void testMySQL() {
        long countBefore = bookRepository.count();
        assertThat(countBefore).isEqualTo(2);
    }

    @Test
    void bookNaturalTest() {
        BookNatural bookNatural = new BookNatural();
        bookNatural.setTitle("My Book");
        BookNatural saved = bookNaturalRepository.save(bookNatural);

        BookNatural fetchedBook = bookNaturalRepository.getById(saved.getTitle());
        assertThat(fetchedBook).isNotNull();
        Assertions.assertEquals("My Book" , fetchedBook.getTitle());
    }
}


