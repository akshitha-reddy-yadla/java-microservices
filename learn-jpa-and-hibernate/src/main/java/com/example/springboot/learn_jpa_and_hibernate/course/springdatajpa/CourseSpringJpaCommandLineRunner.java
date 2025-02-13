package com.example.springboot.learn_jpa_and_hibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springboot.learn_jpa_and_hibernate.course.Course;

@Component
public class CourseSpringJpaCommandLineRunner implements CommandLineRunner  {
	
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS NOW", "in28minutes"));
		repository.save(new Course(2, "Learn AWS NOW +", "in28minutes"));
		repository.save(new Course(3, "Learn AWS NOW ++", "in28minutes"));
		
		repository.deleteById(2l);
		
		System.out.println(repository.findById(1l));
			
	}
}
