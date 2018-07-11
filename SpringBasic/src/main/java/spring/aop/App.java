package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringCustomer.class);

		//CustomerS cust = (CustomerS) appContext.getBean("customer");
		CustomerS str = (CustomerS)appContext.getBean("run3");

		System.out.println("*************************");
		//cust.printName();
		System.out.println(str);
		System.out.println("*************************");
		//cust.printURL();
		System.out.println("*************************");
		try {
			//cust.printThrowException();
		} catch (Exception e) {

		}
	}

}
