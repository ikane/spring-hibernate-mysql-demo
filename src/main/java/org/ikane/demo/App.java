package org.ikane.demo;

import org.ikane.demo.entities.Employee;
import org.ikane.demo.service.IEmployeeService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee em = new Employee();
		em.setName("Eric");
		em.setAge(25);
		
		IEmployeeService emService = context.getBean("employeeService", IEmployeeService.class);
		emService.persistEmployee(em);
		
		em = emService.findEmployeeById(6);
		em.setAge(33);
		emService.updateEmployee(em);
		System.out.println("Updated age :" + em.getAge());		
		/*
		em.setAge(32);
		emService.updateEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById(1).getAge());
		emService.deleteEmployee(em);
		*/
		context.close();
    }
}
