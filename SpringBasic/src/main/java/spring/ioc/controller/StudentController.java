package spring.ioc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import spring.ioc.config.StudentConfig;
import spring.ioc.di.Student;
import spring.ioc.di.StudentID;

@Controller
public class StudentController {
	
//	@Autowired
//	//@Qualifier("student1")
//	private static Student student1;
//	
//	@Autowired
//	//@Qualifier("ID1")
//	private static StudentID ID;
	

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext ctx = 
	            new AnnotationConfigApplicationContext(StudentConfig.class);
		Student stu = ctx.getBean(Student.class);
		System.out.println(stu.getName());
	}
	
	
	

}
