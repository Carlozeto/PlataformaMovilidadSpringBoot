package com.example.demo.services;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.route;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class RouteServiceImpl implements RouteService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<route> findRoutesByParadeIds(int originParadeId, int destinationParadeId) {
        String query = "SELECT DISTINCT r.* " +
                       "FROM route r " +
                       "JOIN route_parade rp1 ON r.routeId = rp1.routeId " +
                       "JOIN route_parade rp2 ON r.routeId = rp2.routeId " +
                       "WHERE rp1.paradeId = :originParadeId AND rp2.paradeId = :destinationParadeId";

        Map<String, Integer> params = new HashMap<>();
        params.put("originParadeId", originParadeId);
        params.put("destinationParadeId", destinationParadeId);

        Query nativeQuery = entityManager.createNativeQuery(query, route.class);
        params.forEach(nativeQuery::setParameter);

        return nativeQuery.getResultList();
    }

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends route> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends route> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<route> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public route getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public route getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public route getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends route> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends route> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends route> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<route> findAll() {
		String query = "SELECT * FROM route";

 Map<String, Integer> params = new HashMap<>();

 Query nativeQuery = entityManager.createNativeQuery(query, route.class);
 params.forEach(nativeQuery::setParameter);

 return nativeQuery.getResultList();
	}

	@Override
	public List<route> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends route> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<route> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(route entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends route> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<route> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<route> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends route> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends route> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends route> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends route> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends route, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
}