package com.niit.MavenProjectNew;

import static org.junit.Assert.assertEquals;

//import org.h2.engine.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.config.ApplicationContext;
import com.niit.model.EmployeeRegistration;
import com.niit.service.EmpService;


@Component
@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = ApplicationContext.class)

public class AppTest {
	
	
	@Autowired
	private EmpService employeeService;
	EmployeeRegistration emp;

	@Before
	public void setup() {

		/*
		 * if(employeeService.getEmpByName("john")!=null) {
		 * employeeService.deleteEmp(employeeService.getEmpByName("Ryan").getEmpId()); }
		 * 
		 * if(employeeService.getEmpByName("sam")!=null) {
		 * employeeService.deleteEmp(employeeService.getEmpByName("John").getEmpId()); }
		 * 
		 * if(employeeService.getEmpByName("Chris")!=null) {
		 * employeeService.deleteEmp(employeeService.getEmpByName("Chris").getEmpId());
		 * }
		 */

		EmployeeRegistration emp1 = new EmployeeRegistration();
		//emp1.setEmpId(107);
		emp1.setEmpName("priya");
		emp1.setEmpGender("female");
		emp1.setEmpDob("25/08/1988");
		emp1.setEmpobilenum("9878654366");
		emp1.setEmpEmailId("raj@gmail.com");
		emp1.setEmpPassword("raj@123");
		emp1.setEmpCity("Pune");
		emp1.setEmpDesignation("Trainer");
		emp1.setEmpGraduation("BTech");
		emp1.setEmpPostgraduation("MTech");
		emp1.setEmpSkills("C,CPP,JAVA,J2EE,HIBERNATE,SPRING,STRUTS,Angular JS");

		EmployeeRegistration emp2 = new EmployeeRegistration();
		//emp1.setEmpId(109);
		emp1.setEmpName("def");
		emp1.setEmpGender("Male");
		emp1.setEmpDob("08/06/1991");
		emp1.setEmpobilenum("9878367678");
		emp1.setEmpEmailId("prasad@gmail.com");
		emp1.setEmpPassword("prasad@123");
		emp1.setEmpCity("Pune");
		emp1.setEmpDesignation("Project Manager");
		emp1.setEmpGraduation("BTech");
		emp1.setEmpPostgraduation("MTech");
		emp1.setEmpSkills("C,CPP,JAVA,J2EE,HIBERNATE,SPRING,Angular JS");

		employeeService.addEmp(emp1);
		employeeService.addEmp(emp2);
	}
	/*
	 * @After public void teardown() {
	 * 
	 * employeeService.deleteEmp(employeeService.getEmpByName("John").getEmpId());
	 * employeeService.deleteEmp(employeeService.getEmpByName("Chris").getEmpId());
	 * if(employeeService.getEmpByName("Ryan")!=null) {
	 * employeeService.deleteEmp(employeeService.getEmpByName("Ryan").getEmpId()); }
	 * }
	 */

	// +ve test case

	
	/*  @Test public void testAddEmp() {
	  
	  EmployeeRegistration emp=new EmployeeRegistration(); emp.setEmpId(109);
	  emp.setEmpName("Ryan"); emp.setEmpEmailId("ryan@gmail.com");
	  emp.setEmpPassword("ryan@123"); emp.setRole("Project Manager");
	  assertEquals(true, employeeService.addEmp(emp));
	  }*/
	
	// -ve test
	/*
	 * @Test public void testAddEmp() {
	 * 
	 * EmployeeRegistration emp=new EmployeeRegistration();
	 * emp.setEmpId(103);//error as trying to insert same id emp.setEmpName("Ryan");
	 * emp.setEmpEmailId("ryan@gmail.com"); emp.setEmpPassword("ryan@123");
	 * emp.setRole("Project Manager"); assertEquals(true,
	 * employeeService.addEmp(emp));
	 * 
	 * }
	 */

	/*
	 * @Test public void testdeleteEmp() {
	 * 
	 * int id=1; assertEquals(true, employeeService.deleteEmp(id));
	 * 
	 * }
	 */
	/*
	 * @Test public void testdeleteEmp() {
	 * 
	 * int id=102; assertEquals(true, employeeService.deleteEmp(id));
	 * 
	 * }
	 */

	/*
	 * //-VE TEST CASE
	 * 
	 * @Test public void testGetEmpByName() {
	 * 
	 * EmployeeRegistration emp=new EmployeeRegistration();
	 * 
	 * 
	 * assertEquals(1,employeeService.getEmpByName("John").getEmpId());
	 * 
	 * }
	 */

	/*
	 * @Test public void testGetEmpByName() {
	 * 
	 * EmployeeRegistration emp=new EmployeeRegistration();
	 * 
	 * 
	 * assertEquals(101,employeeService.getEmpByName("John").getEmpId()); }
	 */

	
	/*  @Test 
	  public void testGetEmpById() {
	 
	 EmployeeRegistration emp=new EmployeeRegistration();
	
	 
	  assertEquals("John",employeeService.getEmpById(101).getEmpName());
	  
	  }*/
	 
	// +ve test case
	
	@Test 
	public void testGetEmpDetails() {
	 

	 int count = employeeService.getEmpDetails().size();

	assertEquals("success", 2, count); }
	
	// -ve test case

	
	/*  @Test public void testGetEmpDetails() {
	  
	  
	  int count = employeeService.getEmpDetails().size();
	  
	  assertEquals("success", 3, count); }
	 
*/
/*@Test
	public void testUpdateEmp() {
	
		// emp = new EmployeeRegistration();
		
		emp = employeeService.getEmpById(108);
		
		emp.setEmpEmailId("test@gmail.com");
		
		
		System.out.println(emp);
		
		boolean flag = employeeService.updateEmp(emp);

		assertEquals("success", true, flag);
	}*/

}
