package com.ankit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankit.bo.EmployeeBO;
import com.ankit.dao.EmployeeDAO;
import com.ankit.dto.EmployeeDTO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;

	
	@Override
	public List<EmployeeDTO> getEmpDetails() {
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=null;
		listBO=dao.reteriveEmp();
		listDTO=new ArrayList<EmployeeDTO>();
		for(EmployeeBO bo:listBO) {
			EmployeeDTO empdto=new EmployeeDTO();
			empdto.setEmpno(bo.getEmpno());
			empdto.setEmpname(bo.getEmpname());
			empdto.setJob(bo.getJob());
			empdto.setSalary(bo.getSalary());
			empdto.setDeptno(bo.getDeptno());
			listDTO.add(empdto);
			}
		return listDTO;
	}

}
