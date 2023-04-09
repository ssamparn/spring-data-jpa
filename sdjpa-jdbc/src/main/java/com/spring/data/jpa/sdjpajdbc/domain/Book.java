package com.spring.data.jpa.sdjpajdbc.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "publisher")
    private String publisher;

    @Transient
    private Author authorId;

    public Book(String title, String isbn, String publisher) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public Author getAuthor() {
        return authorId;
    }

    public void setAuthor(Author authorId) {
        this.authorId = authorId;
    }
}
