package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.enterprise;

@Repository
public interface EnterpriseService extends JpaRepository<enterprise, Integer>{

}
