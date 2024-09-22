package com.springBootHibernet.learnJPAHibernet.Jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springBootHibernet.learnJPAHibernet.Course.Course;

@Repository
public class CourseRepository {
	@Autowired
	private JdbcTemplate springJdbcTemplate;

	public static String INSERT_QUERY = """
			insert into course(id,name,author)
			values(?,?,?);

			""";
	
	public static String DELETE_Query =
			"""
			delete from course where id =?;
			""";

	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_Query,id);
	}

}
