package com.spring.sdjpaintro.bootstrap;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.spring.sdjpaintro.domain.Book;
import com.spring.sdjpaintro.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    @Override
    public void run(String... args) {
        Book bookDDD = new Book("Domain Driven Design", "123", "RandomHouse");
        bookRepository.save(bookDDD);

        Book bookSIA = new Book("Spring In Action", "234234", "Oriely");
        bookRepository.save(bookSIA);

        bookRepository.findAll().forEach(book -> {
            log.info("Book inserted with Id {} and Title {}", book.getId(), book.getTitle());
        });

    }
}
