package com.ankit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ankit.dto.EmployeeDTO;
import com.ankit.service.EmployeeService;

@Controller
public class EmployeeController {
   
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value="/empdetail.htm")
	public String empDetails(Map<String,Object> map)
			throws Exception {
		List<EmployeeDTO> getEmp=null;
		getEmp=service.getEmpDetails();
		for (EmployeeDTO dto : getEmp) {
			System.out.println(dto.getEmpno());
		}
		map.put("empdetails",getEmp);
		return "show_emps";
		
	}

}
