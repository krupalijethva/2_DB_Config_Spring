package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.model.Document;

public interface DocRepository extends JpaRepository<Document, Long> {

	@Query(value = "SELECT * FROM document where filename=:filename", nativeQuery = true)	
	public Document findFilename(@Param("filename") String filename);
   // public Document findFilename(@Param("filename") String filename);
	

}
