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
	private Integer id;

	@Column(name = "ENAME")
	private String name;

	@Column(name = "JOB")
	private String job;

	@Column(name = "MGR")
	private Integer managerId;

	@Column(name = "HIREDATE")
	private Date hireDate;

	@Column(name = "SAL")
	private Float salary;

	@Column(name = "COMM")
	private Float commission;

	@Column(name = "DEPTNO")
	private Integer deptNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Float getCommission() {
		return commission;
	}

	public void setCommission(Float commission) {
		this.commission = commission;
	}

	public Integer getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(Integer deptNumber) {
		this.deptNumber = deptNumber;
	}

	public Emp() {

	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", job=" + job + ", managerId=" + managerId + ", hireDate="
				+ hireDate + ", salary=" + salary + ", commission=" + commission + ", deptNumber=" + deptNumber + "]";
	}

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
}
