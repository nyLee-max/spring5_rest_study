package spring5_rest_study.service;

import static org.junit.Assert.fail;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import spring5_rest_study.config.ContextRoot;
import spring5_rest_study.dto.Department;
import spring5_rest_study.dto.Employee;
import spring5_rest_study.dto.Title;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ContextRoot.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WebAppConfiguration
public class EmployeeServiceTest {

	private static final Log log = LogFactory.getLog(EmployeeServiceTest.class);
	
	@Autowired
	private EmployeeService service;
	
	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test1GetLists() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Employee> list = service.getLists();
		Assert.assertNotNull(list);
		log.debug(list.toString());
	}

	@Test
	public void test2GetEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee employee = service.getEmployee(1003);
		Assert.assertNotNull(employee);
		log.debug(employee.toString());
	}

	@Test
	public void test3RegisterEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee newEmployee = new Employee(1004, "이나연", new Title(3), new Employee(1003), 1000000, new Department(1));
		int res = service.registerEmployee(newEmployee);
		Assert.assertEquals(1, res);
		log.debug(newEmployee.toString());
	}

	@Test
	public void test4ModifyEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee newEmployee = new Employee(1004, "이나영", new Title(5), new Employee(4377), 300000, new Department(1));
		int res = service.modifyEmployee(newEmployee);
		Assert.assertEquals(1, res);
		log.debug(newEmployee.toString());	
	}

	@Test
	public void test5RemoveEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee newEmployee = new Employee(1004, "이나영", new Title(5), new Employee(4377), 300000, new Department(1));
		int res = service.removeEmployee(newEmployee);
		Assert.assertEquals(1, res);
		log.debug(newEmployee.toString());
	}

}
