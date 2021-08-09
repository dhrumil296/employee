package com.lti.appl.dao;

import java.util.List;

import com.lti.appl.beans.Employee;
import com.lti.appl.exp.HrException;

public interface EmpDao {
	public int saveEmployee(Employee e);
	public List<Employee> getEmpList();
	public Employee findEmpById(int empNo);
	public Employee updateSal(int empNo, long empSal) throws HrException;
	public Employee deleteEmpById(int empNo);
}
