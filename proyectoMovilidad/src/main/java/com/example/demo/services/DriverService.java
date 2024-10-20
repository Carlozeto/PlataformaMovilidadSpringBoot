package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.driver;

@Repository
public interface DriverService extends JpaRepository<driver, String>{

}
