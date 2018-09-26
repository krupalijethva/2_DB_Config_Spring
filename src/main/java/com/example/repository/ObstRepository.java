package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.model.Obstruction;

public interface ObstRepository extends JpaRepository<Obstruction, Long> { 

}
