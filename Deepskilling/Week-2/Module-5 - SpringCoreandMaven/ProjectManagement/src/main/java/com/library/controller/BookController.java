package com.library.controller;

import com.library.entity.Book;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
==========================================================
Exercise 9
Book REST Controller

This controller handles CRUD operations.
==========================================================
*/

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    /*
    ==========================================
    Exercise 9
    Get All Books
    ==========================================
    */

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    /*
    ==========================================
    Exercise 9
    Get Book By Id
    ==========================================
    */

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    /*
    ==========================================
    Exercise 9
    Add Book
    ==========================================
    */

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    /*
    ==========================================
    Exercise 9
    Delete Book
    ==========================================
    */

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
        return "Book deleted successfully!";
    }
}