package com.springBootHibernet.learnJPAHibernet.Jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springBootHibernet.learnJPAHibernet.Course.Course;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	@Autowired
	CourseRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1,"AWS","Antony"));
		
		  repository.insert(new Course(3,"Azure","MArk")); repository.insert(new
		  Course(4,"Devops","Ranga"));
		  repository.deleteById(1);
		 

	}

}
