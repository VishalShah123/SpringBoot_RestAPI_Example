package com.spring.springRest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.springRest.Entities.Course;

public interface CourseDao extends JpaRepository<Course, Integer> {

	public List<Course> findByName(String name);

	public List<Course> findByLocation(String location);

	public List<Course> findByNameAndLocation(String name, String location);

//	findByNameStartingWith();
//	findByNameEndsWith();

// JPQL
//	@Query("Select u from User u")  
// NATIVE Sql
	@Query(value = "select * from user", nativeQuery = true)
	public List<Course> getAll();

	@Query("Select u from User u where u.name=:n and u.profile=:p")
	public List<Course> getUserByNameAndProfile(@Param("n") String name, @Param("p") String profile);

}
