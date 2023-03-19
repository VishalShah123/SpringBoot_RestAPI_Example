package com.spring.springRest.Ctl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springRest.Entities.Course;
import com.spring.springRest.Services.CourseService;

@RestController

public class MyCtl {

	@Autowired
	CourseService courseService;
	
	//@RequestMapping(value="/home", method=RequestMethod.GET)
	@GetMapping("/home")
	public String home() {
		return "Welcome to courses application home page";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public  Optional<Course> getCourse(@PathVariable String courseId){
		return courseService.getCourse(courseId);
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
	@DeleteMapping("/courses/{courseID}")
	public HttpStatus deleteCourse(@PathVariable String courseId) {
		return courseService.delete(Integer.parseInt(courseId));
	}


}
