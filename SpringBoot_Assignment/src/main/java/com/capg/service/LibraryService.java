package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.model.Library;
import com.capg.repository.LibraryRepo;


@Service
@Transactional
public class LibraryService {
	@Autowired
	LibraryRepo libraryRepos;
	
	@Autowired
	BookService bookServ;
	
	public void addLibrary(Library library) {
		libraryRepos.save(library);
	}
	
	public List<Library> getAllLibrary(){
		return libraryRepos.findAll();
	}
	
	public List<String> getAllLibraryName(){
		return libraryRepos.getAllLibraryname();
	}
	
	public Library getLibraryByName(String name) {
		return libraryRepos.findByLibraryname(name);
	}
	
	public Library findById(int lid) {
		Library library = libraryRepos.getOne(lid);
		return library;
	}
}
