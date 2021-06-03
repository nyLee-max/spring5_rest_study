package spring5_rest_study.service;

import java.util.List;

import org.springframework.stereotype.Service;

import spring5_rest_study.dto.Employee;

@Service
public interface EmployeeService {
	List<Employee> getLists();

	Employee getEmployee(int empNo);

	int registerEmployee(Employee employee);

	int modifyEmployee(Employee employee);

	int removeEmployee(Employee employee);
}
