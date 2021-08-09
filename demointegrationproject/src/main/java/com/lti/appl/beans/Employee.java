package com.lti.appl.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMPSPRING")
public class Employee {

	@Id
	@Column(name = "EMPNO")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="HB_EMPSPRING_SEQ")
//	@SequenceGenerator(name="HB_EMPSPRING_SEQ", sequenceName="EmpSpring_Seq", allocationSize = 0)
	private int empNo;

	@Column(name = "ENAME")
	private String eName;

	@Column(name = "SAL")
	private long eSal;

	public Employee() {
		super();
	}

	public Employee(int empNo, String eName, long eSal) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.eSal = eSal;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public long geteSal() {
		return eSal;
	}

	public void seteSal(long eSal) {
		this.eSal = eSal;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", eSal=" + eSal + "]";
	}

}
