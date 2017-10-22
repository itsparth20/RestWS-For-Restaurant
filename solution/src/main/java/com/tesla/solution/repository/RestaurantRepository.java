package com.tesla.solution.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.query.Param;
import com.tesla.solution.model.Restaurant;

@RepositoryRestResource(path="restaurants", collectionResourceRel="restaurants")
public interface RestaurantRepository extends CrudRepository<Restaurant, Long>{
	List<Restaurant> findByCity(@Param("city") String city);
	List<Restaurant> findByName(@Param("name") String name);
	List<Restaurant> findByCategory(@Param("category") String category);
	List<Restaurant> findByNameAndCity(@Param("name") String name, @Param("city") String city);
	List<Restaurant> findByNameAndCityAndCategory(@Param("name") String name, @Param("city") String city, @Param("category") String category);
	List<Restaurant> findByCityAndCategory(@Param("city") String city, @Param("category") String category);
	List<Restaurant> findByNameAndCategory(@Param("name") String name, @Param("category") String category);
}
