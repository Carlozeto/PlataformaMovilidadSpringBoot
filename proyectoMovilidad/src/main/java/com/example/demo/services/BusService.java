package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.bus;

@Repository
public interface BusService extends JpaRepository<bus, String> {

}
