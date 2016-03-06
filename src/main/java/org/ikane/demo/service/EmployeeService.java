package org.ikane.demo.service;

import org.ikane.demo.dao.EmployeeDao;
import org.ikane.demo.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("employeeService")
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeDao employeeDAO;
	
	@Transactional
	public void persistEmployee(Employee employee) {
		employeeDAO.persistEmployee(employee);
		
	}

	@Transactional
	public void updateEmployee(Employee employee) {
		employeeDAO.updateEmployee(employee);
		
	}
	@Transactional
	public Employee findEmployeeById(Integer id) {
		return employeeDAO.findEmployeeById(id);
	}

	@Transactional
	public void deleteEmployee(Employee employee) {
		employeeDAO.deleteEmployee(employee);
		
	}
}
