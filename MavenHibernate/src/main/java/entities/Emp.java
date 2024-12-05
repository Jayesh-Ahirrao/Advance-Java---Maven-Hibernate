package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Emp {
	/*
	 * EMPNO int ENAME varchar(10) JOB varchar(9) MGR int HIREDATE date SAL
	 * decimal(7,2) COMM decimal(7,2) DEPTNO int
	 * 
	 */

	@Id
	@Column(name = "EMPNO")
	private int id;

	@Column(name = "ENAME")
	private String name;

	@Column(name = "JOB")
	private String job;

	@Column(name = "MGR")
	private int managerId;

	@Column(name = "HIREDATE")
	private Date hireDate;

	@Column(name = "SAL")
	private float salary;

	@Column(name = "COMM")
	private float commission;

	@Column(name = "DEPTNO")
	private int deptNumber;
	
	
	public Emp(int id, String name, String job, int managerId, Date hireDate, float salary, float commission,
			int deptNumber) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.managerId = managerId;
		this.hireDate = hireDate;
		this.salary = salary;
		this.commission = commission;
		this.deptNumber = deptNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}

	public int getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}
}
