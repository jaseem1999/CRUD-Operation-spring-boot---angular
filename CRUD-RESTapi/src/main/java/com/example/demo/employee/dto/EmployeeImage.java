package com.example.demo.employee.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee_profile")
public class EmployeeImage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long tid;
	
	@Lob
	private byte[] img;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emp")
	private Employee emp;
	
	
	public EmployeeImage() {
		// TODO Auto-generated constructor stub
	}


	public EmployeeImage(long tid, byte[] img, Employee emp) {
		super();
		this.tid = tid;
		this.img = img;
		this.emp = emp;
	}


	public long getTid() {
		return tid;
	}


	public byte[] getImg() {
		return img;
	}


	public Employee getEmp() {
		return emp;
	}


	public void setTid(long tid) {
		this.tid = tid;
	}


	public void setImg(byte[] img) {
		this.img = img;
	}


	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
}
