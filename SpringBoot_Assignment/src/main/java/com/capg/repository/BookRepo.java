package com.capg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.model.Book;


@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{
	
	@Query("select b from Book b,Library li where b.library = li.libraryId and b.library.libraryId = :lid")
	List<Book> deleteAllBookByLibraryId(@Param("lid")int lid);

}
