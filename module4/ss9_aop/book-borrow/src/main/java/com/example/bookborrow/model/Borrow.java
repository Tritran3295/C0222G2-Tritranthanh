package com.example.bookborrow.model;

import javax.persistence.*;

@Entity
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long codeBook;

    @ManyToOne
    @JoinColumn(name = "id_book",referencedColumnName = "id")
    private Book book;

    public Borrow() {
    }

    public Borrow(long id, long codeBook, Book book) {
        this.id = id;
        this.codeBook = codeBook;
        this.book = book;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(long codeBook) {
        this.codeBook = codeBook;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
