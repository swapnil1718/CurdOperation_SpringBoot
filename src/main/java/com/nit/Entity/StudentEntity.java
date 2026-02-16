package com.nit.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_demo")
public class StudentEntity
{
	@Id
	@Column(name="roll_No")
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer rollNo;
	@Column(name="First_Name")
	private String firstName;
	@Column(name="Last_Name")
	private String lastName;
	@Column(name="Stud_age")
	private int age;
	private String qualification;
	
	public StudentEntity(Integer rollno, String firstName, String lastName, int age, String qualification) {
		super();
		this.rollNo=rollno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.qualification = qualification;
	}
	public StudentEntity() {

	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	

}
