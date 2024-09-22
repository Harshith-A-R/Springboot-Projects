package com.springBootProject.learnSpringbootRestAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
@RequestMapping("/Course")
	public List<Course> retreiveAllCourses(){
		return Arrays.asList(new Course (1,"Devops","JavaCoder"),
				new Course(2,"AWS","JavaCoder"),
				new Course(3,"SecOps","Javascripter")
				);
				
				
	}
	/*public List<Course> retreiveAllCourses() {
	List<Course> ll =new ArrayList<Course>();
	ll.add(new Course(1,"AWS","JavaCoder"));
	ll.add(new Course(2,"AWDevops","JavaCoder"));
	return ll;
	
}*/
}
