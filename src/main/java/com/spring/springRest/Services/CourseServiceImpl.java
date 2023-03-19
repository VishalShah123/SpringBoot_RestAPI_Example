 package com.spring.springRest.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.spring.springRest.Entities.Course;
import com.spring.springRest.dao.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDao courseDao;

	public CourseServiceImpl() {
	}

	@Override
	public List<Course> getCourses() {
	
		return courseDao.findAll();
		
	}

	

	@Override
	public Course updateCourse(Course course) {
		return courseDao.save(course);
	}

	@Override
	public HttpStatus delete(int courseId) {

		Course c = courseDao.getById(courseId);

		try {
			courseDao.delete(c);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.NO_CONTENT;
		}
	}

	@Override
	public Course addCourse(Course course) {
		return courseDao.save(course);
	}

	@Override
	public Optional<Course> getCourse(String courseId) {
return	courseDao.findById(Integer.parseInt(courseId));
		
	}

}
