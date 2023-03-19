package com.spring.springRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.springRest.Entities.Course;


public interface CourseDao extends JpaRepository<Course, Integer> {
	
}
