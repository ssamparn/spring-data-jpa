package com.spring.data.jpa.sdjpajdbc.repository.h2;

import com.spring.data.jpa.sdjpajdbc.domain.Book;
import com.spring.data.jpa.sdjpajdbc.repository.BookRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookRepositoryTransactionTest {

    @Autowired
    private BookRepository bookRepository;

    @Order(1)
    @Test @Commit
    void testJpaTestSplice() {
        long countBefore = bookRepository.count();
        assertThat(countBefore).isEqualTo(5);

        bookRepository.save(new Book("My Book", "1235555", "Self"));
        long countAfter = bookRepository.count();

        assertEquals(6, countAfter);
        assertThat(countBefore).isLessThan(countAfter);
    }

    @Order(2)
    @Test
    void testJpaTestSpliceTransaction() {
        long countBefore = bookRepository.count();
        assertThat(countBefore).isEqualTo(6);
    }
}