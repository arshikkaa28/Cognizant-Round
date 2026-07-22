package com.library.service;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
==========================================================
Exercise 1
Book Service

Exercise 2
Setter Dependency Injection

Exercise 5
Spring IoC Container

Exercise 7
Constructor Injection + Setter Injection

Exercise 9
Business Logic
==========================================================
*/

@Service
public class BookService {

    private BookRepository bookRepository;

    /*
    ==========================================
    Exercise 7
    Default Constructor
    ==========================================
    */
    public BookService() {
    }

    /*
    ==========================================
    Exercise 7
    Constructor Injection
    ==========================================
    */
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor Dependency Injection Successful");
    }

    /*
    ==========================================
    Exercise 2
    Setter Injection
    ==========================================
    */
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Dependency Injection Successful");
    }

    /*
    ==========================================
    Exercise 9
    CRUD Methods
    ==========================================
    */

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}