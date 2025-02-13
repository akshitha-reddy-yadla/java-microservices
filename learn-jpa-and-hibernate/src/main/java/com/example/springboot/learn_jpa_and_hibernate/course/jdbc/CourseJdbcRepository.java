package com.example.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springboot.learn_jpa_and_hibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
//	private static String INSERT_QUERY =
//			"""
//			   insert into Course (id, name, author)
//			   values(1, 'Learn AWS', 'in28minutes');
//			""";
//	
//	public void insert() {
//		springJdbcTemplate.update(INSERT_QUERY);
//	}
	
	
	private static String INSERT_QUERY =
			"""
			   insert into Course (id, name, author)
			   values(?, ?, ?);
			""";
	
	private static String DELETE_QUERY = 
			"""
			  DELETE FROM COURSE WHERE id = ?
			""";
	
	private static String SELECT_QUERY_BY_ID = 
			"""
			  SELECT * FROM COURSE WHERE id = ?
			""";
	
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}
	
	
	public void delete(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Course findById(long id) {
	return springJdbcTemplate.queryForObject(SELECT_QUERY_BY_ID, new BeanPropertyRowMapper<>(Course.class), id);
	}

}
