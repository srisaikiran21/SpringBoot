package com.capg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.model.Library;



@Repository
public interface LibraryRepo extends JpaRepository<Library, Integer>{
	
	@Query("select li.libraryName from Library li")
	List<String> getAllLibraryname();
	
	@Query("select li from Library li where li.libraryName = :name")
	Library findByLibraryname(@Param("name")String libName);

}
