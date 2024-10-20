package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.route_parade;

@Repository
public interface RouteParadeService extends JpaRepository<route_parade, Integer>{

}
