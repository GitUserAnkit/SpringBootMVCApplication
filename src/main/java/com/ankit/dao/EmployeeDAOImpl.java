package com.ankit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.ankit.bo.EmployeeBO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_DETAILS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP";
    
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<EmployeeBO> reteriveEmp() {
		List<EmployeeBO> listBO=null;
		listBO= jt.query(GET_EMP_DETAILS,new Extractor());
		return listBO;
	} 
	private class Extractor implements ResultSetExtractor<List<EmployeeBO>>{

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			EmployeeBO bo=null;
			List<EmployeeBO> listBO=null;
			listBO=new ArrayList<>(); 
			while(rs.next()) {
		    bo=new EmployeeBO();
		    bo.setEmpno(rs.getInt(1));
		    bo.setEmpname(rs.getString(2));
		    bo.setJob(rs.getString(3));
		    bo.setSalary(rs.getInt(4));
		    bo.setDeptno(rs.getInt(5));	  
		    listBO.add(bo);
			}
			return listBO;
			
			}
	}


}
