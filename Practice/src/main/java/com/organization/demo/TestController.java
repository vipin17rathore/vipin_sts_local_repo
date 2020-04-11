package com.organization.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.organization.demo.org.EmpService;
import com.organization.demo.org.Employee;

	@RestController
	public class TestController {

		@Autowired
		private EmpService empS;
		
		@Autowired
		private StudentRepository stRepo;
		
		@GetMapping("/getEmpData")
		public Employee getData()
		{
			System.out.println("controller");
			return empS.getData();
		}
		
		@GetMapping("/employees")
		public List<Employee> GetEmployee()
		{
			System.out.println("controller");
			return empS.getDataAll();
		}
		
		@PostMapping("/addEmployee")
		public String AddEmployees(@RequestBody Employee e)
		{
			System.out.println("object"+e.toString());
			return empS.addData(e);
		}
		
		@GetMapping("/studentData")
		public List<Student	> StudentData()
		{
			System.out.println("StudentData service");
			return stRepo.findAll();
		}
		
		@PostMapping("/loadData")
		public List<Student	> SaveStuData(@RequestBody Student st)
		{
			System.out.println("SaveStuData service");
			stRepo.save(st);
			return stRepo.findAll();
		}
	}


