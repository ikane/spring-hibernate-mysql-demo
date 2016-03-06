package org.ikane.demo.dao;

import org.ikane.demo.entities.Employee;

public interface EmployeeDao {

	void persistEmployee(Employee employee);

	Employee findEmployeeById(Integer id);

	void updateEmployee(Employee employee);

	void deleteEmployee(Employee employee);

}
