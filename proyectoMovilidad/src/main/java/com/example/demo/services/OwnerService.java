package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.owner;

@Repository
public interface OwnerService extends JpaRepository<owner, String>{

}
