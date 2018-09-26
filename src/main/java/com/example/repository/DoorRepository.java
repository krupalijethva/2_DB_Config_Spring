package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Door;

public interface DoorRepository extends JpaRepository<Door, Long> {

}
