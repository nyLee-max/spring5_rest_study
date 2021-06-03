package spring5_rest_study.service.impl;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5_rest_study.dto.Employee;
import spring5_rest_study.mapper.EmployeeMapper;
import spring5_rest_study.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	static final Log log = LogFactory.getLog(EmployeeServiceImpl.class);
	
	@Autowired
	private EmployeeMapper mapper;
	
	@Override
	public List<Employee> getLists() {
		return mapper.getLists();
	}

	@Override
	public Employee getEmployee(int empNo) {
		return mapper.getEmployee(empNo);
	}

	@Override
	public int registerEmployee(Employee employee) {
		return mapper.registerEmployee(employee);
	}

	@Override
	public int modifyEmployee(Employee employee) {
		return mapper.modifyEmployee(employee);
	}

	@Override
	public int removeEmployee(Employee employee) {
		return mapper.removeEmployee(employee);
	}

}
