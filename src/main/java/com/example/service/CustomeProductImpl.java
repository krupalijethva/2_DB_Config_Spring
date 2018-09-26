package com.example.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.WorkTableModel;
import com.example.repository2.CustomeProductRepository;

@Service
@Transactional
public class CustomeProductImpl implements WorkTableModelService {
	
	@Autowired
	CustomeProductRepository CustomeProductRepository;

	@Override
	public List<WorkTableModel> findByUserName(String userName) {
		// TODO Auto-generated method stub
		return CustomeProductRepository.findbyUserName(userName);
	}

	@Override
	public Optional<WorkTableModel> findById(Long id) {
		// TODO Auto-generated method stub
		return CustomeProductRepository.findById(id);
	}

	@Override
	public List<WorkTableModel> findAllCustomProduct() {
		// TODO Auto-generated method stub
		return CustomeProductRepository.findAll();
	}

}
