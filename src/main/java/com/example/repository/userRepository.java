package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.User;
import java.util.List;
import java.util.Optional;


public interface userRepository extends JpaRepository<User, Long> {
	List<User> findAll();

	//User saveAll(Optional<User> user);		
}
