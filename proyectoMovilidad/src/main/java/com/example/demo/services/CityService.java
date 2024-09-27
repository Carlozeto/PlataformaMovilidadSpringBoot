package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.parade;

public interface CityService extends JpaRepository<parade, Integer>{

}
