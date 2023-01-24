package com.springrest.springrest.services;

import java.util.List;

import com.springrest.exception.CourseException;
import com.springrest.springrest.entties.Course;

public interface CourseService {
	public List<Course> getCourses()throws CourseException;
    public Course getCourse(long courseId)throws CourseException;
    public Course addCourse(Course course)throws CourseException;
    public Course updateCourse(Course course)throws CourseException;
    public void deleteCourse(long parseLong)throws CourseException;
		

}
