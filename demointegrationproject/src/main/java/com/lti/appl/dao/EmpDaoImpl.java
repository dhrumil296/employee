package com.lti.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.lti.appl.beans.Employee;
import com.lti.appl.exp.HrException;

@Repository("empDao")
//@EnableTransactionManagement
public class EmpDaoImpl implements EmpDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int saveEmployee(Employee e) {
		em.persist(e);
		return 0;
	}

	@Override
	@Transactional
	public List<Employee> getEmpList() {
		List<Employee> list = em.createQuery("FROM Employee").getResultList();
		return list;
	}

	@Override
	@Transactional
	public Employee updateSal(int empNo, long empSal) throws HrException {
		Employee emp = em.find(Employee.class, empNo);

		if (emp == null || emp.geteSal() <= 10000) {
			throw new HrException("Set Sal must be greater than 0 or user does not exist");
		} else {
			emp.seteSal(empSal);
			em.merge(emp);
		}
		return emp;
	}

	@Override
	@Transactional
	public Employee findEmpById(int empNo) {
		return em.find(Employee.class, empNo);
	}

	@Override
	@Transactional
	public Employee deleteEmpById(int empNo) {
		Employee emp = em.find(Employee.class, empNo);
		em.remove(emp);
		return emp;
	}

}
