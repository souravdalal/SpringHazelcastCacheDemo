package com.blogspot.souravdalal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogspot.souravdalal.model.Book;
import com.blogspot.souravdalal.service.BookService;

import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@RequestMapping("/books")
public class BookController {
	
	
	@Autowired
	private BookService bookService;
	
	@GetMapping(value = "{isbn}" ,produces="application/json")
	public ResponseEntity<Book> getBookByIsbn(String isbn) {
		
		log.info("In getBookByIsbn");
		
		return ResponseEntity.ok(bookService.findBookByIsbn(isbn));
		
	}

}
