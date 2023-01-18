package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entties.Course;

@Service

public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
	

	
	public CourseServiceImpl () {

		}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {

		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {

		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {

		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {

	 Course entity=courseDao.getOne(parseLong);
	 courseDao.delete(entity);
	}
	
	

}
