package com.example.demo.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.route;


@Repository
public interface RouteService extends JpaRepository<route, Integer>{
	List<route> findRoutesByParadeIds(int originParadeId, int destinationParadeId);
}