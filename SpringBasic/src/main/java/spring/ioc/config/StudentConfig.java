package spring.ioc.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import spring.ioc.di.Student;
import spring.ioc.di.StudentID;

@Configuration
@ComponentScan(value= "spring.ioc.*")
public class StudentConfig {
	
	@Bean
	public Student student(){
		
		Student stu = new Student("trung");
		return stu;
		
	}
	
//	@Bean
//	//@Qualifier("ID1")
//	public StudentID id(){
//		StudentID id = new StudentID(12345);
//		
//		return id;
//	}
	

	

}
