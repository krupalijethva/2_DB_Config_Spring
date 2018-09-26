package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.WorkTableModel;

public interface WorkTableModelService {

	List<WorkTableModel> findByUserName(String userName);

	Optional<WorkTableModel> findById(Long id);

	List<WorkTableModel> findAllCustomProduct();
	
}
