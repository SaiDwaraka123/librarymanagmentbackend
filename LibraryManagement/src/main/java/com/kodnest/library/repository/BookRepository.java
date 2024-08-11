package com.kodnest.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.library.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Long>{

}
