package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.demo.entity.Course;
import com.demo.repository.CourseRepository;

@SpringBootApplication
public class SpringbootSelfLearningsApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository courseRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSelfLearningsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Course course = courseRepo.findById(1001L);
		
		logger.info("Course 1001 -> {}", course);
		
		
	}

}
