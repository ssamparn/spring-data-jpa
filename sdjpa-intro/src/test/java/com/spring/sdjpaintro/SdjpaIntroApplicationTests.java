package com.spring.sdjpaintro;

import lombok.extern.slf4j.Slf4j;

import com.spring.sdjpaintro.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
@SpringBootTest
class SdjpaIntroApplicationTests {

	@Autowired
	private BookRepository bookRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testBookRepository() {
		long count = bookRepository.count();
		log.info("Number of Books inserted : {}", count);
		assertThat(count).isGreaterThan(0);
	}
}
