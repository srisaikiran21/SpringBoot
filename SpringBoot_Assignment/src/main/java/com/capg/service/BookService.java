package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.model.Book;
import com.capg.repository.BookRepo;

@Service
@Transactional
public class BookService {
	@Autowired
	BookRepo bookRepos;
	
	public void addBook(Book book) {
		bookRepos.save(book);
	}
	
	public List<Book> getAllBooks(){
		return bookRepos.findAll();
	}
	
	public Book findByBookId(int bid) {
		Book book = bookRepos.getOne(bid);
		return book;
	}
	
	public void updateBook(Book b) {
		Book oldbook = bookRepos.getOne(b.getBookId());
		b.setLibrary(oldbook.getLibrary());
		bookRepos.save(b);
	}
	
	public void deleteBookById(int bid) {
		bookRepos.deleteById(bid);
	}
	
	public void deleteBookByLibraryId(int lid) {
		List<Book> booksList = bookRepos.deleteAllBookByLibraryId(lid);
		
		for(Book b : booksList) {
			bookRepos.delete(b);
		}
	}
}
