package com.spring.sdjpaintro.repository.mysql;

import com.spring.sdjpaintro.domain.BookNatural;
import com.spring.sdjpaintro.domain.composite.AuthorComposite;
import com.spring.sdjpaintro.domain.composite.AuthorEmbedded;
import com.spring.sdjpaintro.domain.composite.NameId;
import com.spring.sdjpaintro.repository.AuthorCompositeRepository;
import com.spring.sdjpaintro.repository.AuthorEmbeddedRepository;
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

    @Autowired
    private AuthorCompositeRepository authorCompositeRepository;

    @Autowired
    private AuthorEmbeddedRepository authorEmbeddedRepository;

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

    @Test
    void authorCompositeTest() {
        NameId nameId = new NameId("Sashank", "Samantray");
        AuthorComposite authorComposite = new AuthorComposite();
        authorComposite.setFirstName(nameId.getFirstName());
        authorComposite.setLastName(nameId.getLastName());
        authorComposite.setCountry("INDIA");

        AuthorComposite saved = authorCompositeRepository.save(authorComposite);
        assertThat(saved).isNotNull();

        AuthorComposite fetched = authorCompositeRepository.getById(nameId);
        assertThat(fetched).isNotNull();
    }

    @Test
    void authorEmbeddedTest() {
        NameId nameId = new NameId("Sashank", "Samantray");
        AuthorEmbedded authorEmbedded = new AuthorEmbedded(nameId);

        AuthorEmbedded saved = authorEmbeddedRepository.save(authorEmbedded);
        assertThat(saved).isNotNull();

        AuthorEmbedded fetched = authorEmbeddedRepository.getById(nameId);
        assertThat(fetched).isNotNull();
    }
}


