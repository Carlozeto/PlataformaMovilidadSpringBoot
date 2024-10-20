package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.parade;

@Repository
public interface ParadeService extends JpaRepository<parade, Integer>{

}
