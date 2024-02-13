package com.deepu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee1 {
	@Id
	
	private int empId;
	private String empname;
	private double empsalary;
	
	public Employee1() {
		super();
	}
	public Employee1(int empId, String empname, double empsalary) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empsalary = empsalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}
	
}
