package com.spring.springRest.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;

import com.spring.springRest.Entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Optional<Course> getCourse(String courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public HttpStatus delete(int courseId);
	
}
