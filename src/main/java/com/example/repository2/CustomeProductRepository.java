package com.example.repository2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.model.WorkTableModel;

public interface CustomeProductRepository extends JpaRepository<WorkTableModel,Long>{
	
	@Query(value = "SELECT * FROM work_table_model where customername=:UserName", nativeQuery = true)	
	public List<WorkTableModel> findbyUserName(@Param("UserName") String UserName);
	
}
