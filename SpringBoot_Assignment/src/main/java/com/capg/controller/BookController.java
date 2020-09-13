package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.model.Book;
import com.capg.model.Library;
import com.capg.service.BookService;
import com.capg.service.LibraryService;

@Controller
public class BookController {
	@Autowired
	LibraryService libraryServ;
	
	@Autowired
	private BookService bookServ;
	
	@RequestMapping("/")
	public String getAllLib(Model model) {
		List<Library> libraries = libraryServ.getAllLibrary();
		List<Book> books = bookServ.getAllBooks();
		model.addAttribute("libs", libraries);
		model.addAttribute("books", books);
		return "index.jsp";
	}
	
	@RequestMapping("/newLibrary")
	public String getAddLibrary() {
		return "AddLibrary.jsp";
	}
	
	@RequestMapping(value = "/addLib" , method = RequestMethod.POST )
	public String addLibrary(@ModelAttribute Library library) {
		libraryServ.addLibrary(library);
		return "redirect:/";
	}
	
	@RequestMapping("/newBook")
	public String getAddBook(Model model) {
		 List<String> libNames = libraryServ.getAllLibraryName();
		 model.addAttribute("libNames", libNames);
		return "AddBook.jsp";
	}
	
	@RequestMapping(value = "/addBook" ,method = RequestMethod.POST)
	public String addBook(@ModelAttribute Book book,@RequestParam("libraryName") String lname) {
		
		Library library = libraryServ.getLibraryByName(lname);
		book.setLibrary(library);
		bookServ.addBook(book);
		
		return "redirect:/";
	}
	
	@RequestMapping("/getEditBook")
	public String getEditBook(@RequestParam("id") int bid,Model model) {
		Book book = bookServ.findByBookId(bid);
		model.addAttribute("b", book);
		return "EditBook.jsp";
		
	}
	
	@RequestMapping(value = "/editBook" ,method = RequestMethod.POST)
	public String editBook(@ModelAttribute Book book) {
		bookServ.updateBook(book);
		return "redirect:/";
	}
	
	@RequestMapping("/deleteBook")
	public String deleteBook(@RequestParam("id") int bid) {
		bookServ.deleteBookById(bid);
		return "redirect:/";
	}
	
}
