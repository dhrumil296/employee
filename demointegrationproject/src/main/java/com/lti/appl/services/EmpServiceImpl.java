package com.lti.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.beans.Employee;
import com.lti.appl.dao.EmpDao;
import com.lti.appl.exp.HrException;

@Service("empService")
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDao empDao;

	public EmpDao getDao() {
		return empDao;
	}

	public void setDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public int saveEmployee(Employee e) {
		return empDao.saveEmployee(e);
	}

	@Override
	public List<Employee> getEmpList() {
		return empDao.getEmpList();
	}

	@Override
	public Employee updateSal(int empNo, long empSal) throws HrException {
		return empDao.updateSal(empNo, empSal);
	}

	@Override
	public Employee findEmpById(int empNo) {
		return empDao.findEmpById(empNo);
	}

	@Override
	public Employee deleteEmpById(int empNo) {
		return empDao.deleteEmpById(empNo);
	}

}
