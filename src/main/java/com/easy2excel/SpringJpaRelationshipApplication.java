package com.easy2excel;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.easy2excel.entity.Book;
import com.easy2excel.entity.Page;
import com.easy2excel.repository.BookRepository;
import com.easy2excel.repository.PageRepository;

@SpringBootApplication
public class SpringJpaRelationshipApplication implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;
	
	@Autowired
    PageRepository pageRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaRelationshipApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		// create a new book
        Book book = new Book("Java 101", "John Doe", UUID.randomUUID().toString());

        // save the book
        bookRepository.save(book);

        
        // create and save new pages
        pageRepository.save(new Page(1, "Introduction contents", "Introduction", book));
        pageRepository.save(new Page(65, "Java 8 contents", "Java 8", book));
        pageRepository.save(new Page(95, "Concurrency contents", "Concurrency", book));
		
	}

}
