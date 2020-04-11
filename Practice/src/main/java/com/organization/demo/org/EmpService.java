package com.organization.demo.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class EmpService {
   
   @Value("${id}")
   String id;
 
   
   public Employee getData() {
	   Config.employee.setDesignation(id);
	   return Config.employee;
   } 
   
   public List<Employee> getDataAll() {
	   return Config.listEmployee;
			   
   }
   
   public String addData(Employee e) {
	   Config.listEmployee.add(e);
	   return "Object added Please refer list service to verify the data";
			   
   }

}
