package com.ankit.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDTO implements Serializable{
	private int empno;
	private String empname;
	private String job;
	private int salary;
	private int deptno;
	//setter and getter
}
