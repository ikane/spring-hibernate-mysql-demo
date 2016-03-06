 package org.ikane.demo.dao;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.metadata.BeanDescriptor;

import org.hibernate.SessionFactory;
import org.ikane.demo.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void persistEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
	}

	public Employee findEmployeeById(Integer id) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	public void updateEmployee(Employee employee) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        BeanDescriptor beanDescriptor = validator.getConstraintsForClass(Employee.class);
        //Set<ConstraintViolation<Employee>> violations = validator.validate(employee, Employee.class);
		
		
		sessionFactory.getCurrentSession().update(employee);

	}

	public void deleteEmployee(Employee employee) {
		sessionFactory.getCurrentSession().delete(employee);

	}
}
