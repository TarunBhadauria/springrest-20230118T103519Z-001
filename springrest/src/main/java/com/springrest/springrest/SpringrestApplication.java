package com.springrest.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entties.Course;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = (DataSourceAutoConfiguration.class))
public class SpringrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}
    
 
 
	
}
