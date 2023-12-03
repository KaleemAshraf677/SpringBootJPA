package com.springboot.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User,Integer> { 
    // Custom Finder methods/Derived Query Methods. 
	
	public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name,String city);
	
	
	// findByNameStartingWith(String prefix)
	// findByNameEndingWith(String suffix)
	// findByNameContaining(String word)  //finding word in the middle of the sentence.
	// findByNameLike(String likePattern)
	// findByAgeLessThan(int age)
	// findByAgeGreaterThanEqual
	// findByAgeIn(Collection<Integer> ages)
	
	
	// JPQL Query and native Query(Java Persistance Query Language)
	//1. (we use here JPQL Query)
	
	@Query("Select u From User u")
	public List<User> getAllUser();
	     
	@Query("Select u From User u Where u.name =:n and u.city=:c")
	public List<User> getUserByName(@Param("n") String name, @Param("c") String city);
	
	
	//2.native querry(MySql)
	
	@Query(value="Select* From User", nativeQuery=true)
	public List<User> getUsers();
	
 }
