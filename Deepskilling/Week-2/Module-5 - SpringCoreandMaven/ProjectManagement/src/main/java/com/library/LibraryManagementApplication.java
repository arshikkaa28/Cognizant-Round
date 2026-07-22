package com.library;

import com.library.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
==========================================================
Exercise 1
Main Class

Loads Spring Application Context.

Exercise 5
Spring IoC Container

Exercise 9
Spring Boot Main Class
==========================================================
*/

@SpringBootApplication
public class LibraryManagementApplication {

    public static void main(String[] args) {

        /*
        ==========================================
        Exercise 9
        Run Spring Boot Application
        ==========================================
        */

        ApplicationContext context =
                SpringApplication.run(LibraryManagementApplication.class, args);
        System.out.println("Spring IoC Container Loaded Successfully");
        System.out.println("Total Beans Loaded: " + context.getBeanDefinitionCount());

        /*
        ==========================================
        Exercise 1 & 5
        Load Bean From IoC Container
        ==========================================
        */

        BookService service = context.getBean(BookService.class);

        System.out.println("==================================");
        System.out.println("Library Management Started");
        System.out.println("BookService Bean Loaded Successfully");
        System.out.println("==================================");
    }
}