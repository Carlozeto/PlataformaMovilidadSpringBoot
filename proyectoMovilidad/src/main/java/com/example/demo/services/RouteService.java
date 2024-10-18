package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.route;

@Repository
public interface RouteService extends JpaRepository<route, Integer>{

}