package spring.SpringInheritence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("emp.xml");
		Employee e=(Employee) context.getBean("emp2");
		
		e.disp();

	}

}
