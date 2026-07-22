package com.library.repository;

import com.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
==========================================================
Exercise 1
Book Repository Class

Exercise 5
Repository Bean

Exercise 9
JPA Repository Interface
==========================================================
*/

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}