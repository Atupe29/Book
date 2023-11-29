package com.jdc04.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jdc04.Entity.Employee;
import com.jdc04.service.Employeeservice;

@Controller
public class EmployeeController {
	@Autowired
	private Employeeservice employeeservice;

	@GetMapping("/")
	public String register(Model model) {

		Employee employee = new Employee();
		model.addAttribute(employee);
		return "register";
	}
	
	@PostMapping("/registerEmployee")
	public String RegisterEmployee(@ModelAttribute("employee") Employee employee) {
		System.out.println(employee);
		employeeservice.registerEmployee(employee);
		return "success";
	}
}
