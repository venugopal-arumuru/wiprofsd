package com.java.spack;
// Constructor Dependency Injection
public class Employee {

	private int empno;
	private String empname;
	private String job;
	private float sal;
	
	public Employee(int empno, String empname, String job, float sal) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.job = job;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
	
	public void EmpInfo()
	{
		System.out.println("Employee Number : " + this.getEmpno());
		System.out.println("Employee Name : " + this.getEmpname());
		System.out.println("Employee Salary : " + this.getSal());
		System.out.println("Employee Job : " + this.getJob());
	}
}
