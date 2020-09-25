package com.easy2excel.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.easy2excel.entity.Book;
import com.easy2excel.repository.BookRepository;
import com.easy2excel.repository.PageRepository;

@RestController
public class BookController {

	@Autowired
	BookRepository bookRepository;
	
	@Autowired
    PageRepository pageRepository;
	
	@GetMapping("/book/{id}")
	public Book m1(@PathVariable String id) {
		
		Iterable<Book> s = bookRepository.findAll();

		s.forEach(e->{
			e.getPages().size();
		});

		return null;
	}
}
