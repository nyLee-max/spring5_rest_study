package spring5_rest_study.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import spring5_rest_study.dto.Employee;

@Component
public interface EmployeeMapper {
	List<Employee> getLists();

	Employee getEmployee(int empNo);

	int registerEmployee(Employee employee);

	int modifyEmployee(Employee employee);

	int removeEmployee(Employee employee);
}
