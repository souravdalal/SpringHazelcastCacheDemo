package com.blogspot.souravdalal.service;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.blogspot.souravdalal.model.Book;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class BookService {
	
	@Cacheable("bookIsbnCache")
	public Book findBookByIsbn(String isbn) {
		
		delay();
		
		Book book = new Book();
		
		book.setIsbn("1");
		
		book.setName("Head First Agile");
		
		book.getAuthors().add("Jennifer Greene");
		
		log.info("Book:"+book);
		
		return book;
	}
	
	
	private void delay() {
		
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
