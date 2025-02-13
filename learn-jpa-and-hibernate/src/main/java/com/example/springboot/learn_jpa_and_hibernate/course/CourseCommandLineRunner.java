//package com.example.springboot.learn_jpa_and_hibernate.course;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.example.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
//
//@Component
//public class CourseCommandLineRunner implements CommandLineRunner {
//	
//	@Autowired
//	private CourseJdbcRepository repository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		repository.insert(new Course(1, "LEarn AWS NOW", "in28minutes"));
//		repository.insert(new Course(2, "LEarn AWS NOW ++", "in28minutes"));
//		repository.insert(new Course(3, "LEarn AWS NOW +++", "in28minutes"));
//		
//		System.out.println(repository.findById(3));
//	}
//}
