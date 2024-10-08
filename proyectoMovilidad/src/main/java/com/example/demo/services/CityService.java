package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.city;

@Repository
public interface CityService extends JpaRepository<city, Integer>{

}
