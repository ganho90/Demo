package spring.aop;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "spring.aop.*")
public class SpringCustomer {

	@Bean(name = "customer")
	public CustomerS cus() {
		CustomerS cus = new CustomerS("tnt", "@");

		return cus;

	}

	@Bean(name = "bm")
	public BeforeMethod bm() {
		BeforeMethod bm = new BeforeMethod();

		return bm;
	}
	
	@Bean(name="ar")
	public AfterReturning ar(){
		AfterReturning ar = new AfterReturning();

		return ar;
	}
	

	@Bean(name = "run2")
	ProxyFactoryBean getBea() {
		ProxyFactoryBean bean = new ProxyFactoryBean();
		bean.setTargetName("customer");
		bean.setInterceptorNames("bm");			
		return bean;
	}
	
	@Bean(name = "run3")
	ProxyFactoryBean getBeas() {
		ProxyFactoryBean bean = new ProxyFactoryBean();
		bean.setTargetName("customer");
		bean.setInterceptorNames("ar");			
		return bean;
	}

	@Bean(name = "run")
	public String run() {

		return "name: " + this.cus().getName() + bm();

	}

}
