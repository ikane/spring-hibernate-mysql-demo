package org.ikane.demo.service;

import org.ikane.demo.entities.Employee;

public interface IEmployeeService {
	
	void persistEmployee(Employee employee);

	Employee findEmployeeById(Integer id);

	void updateEmployee(Employee employee);

	void deleteEmployee(Employee employee);

}
