package com.easy2excel.repository;

import org.springframework.data.repository.CrudRepository;

import com.easy2excel.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

    public Book findByIsbn(String isbn);
    
}
