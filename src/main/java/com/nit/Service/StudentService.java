package com.nit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Entity.StudentEntity;
import com.nit.Repository.StudentRepo;

@Service
public class StudentService
{
	@Autowired
     private StudentRepo repo;
	 
	//insert data
	public StudentEntity insertStudent(StudentEntity stud)
	{
	return repo.save(stud);
	}
	
	//retrieve all data
	public List<StudentEntity> getAllStudent()
	{
		return repo.findAll();
	}
	
     //get data using id
	public StudentEntity getStudentById(int id)
	{
		return repo.findById(id).orElse(null);
	}
	
	
	//update
	public StudentEntity updateStudent(int id,StudentEntity stud)
	{
		StudentEntity oldstud=repo.findById(id).orElse(null);
		
		if(oldstud !=null)
		{
			oldstud.setFirstName(stud.getFirstName());
			oldstud.setLastName(stud.getLastName());
			oldstud.setAge(stud.getAge());
			oldstud.setQualification(stud.getQualification());
			return repo.save(oldstud);
			
		}
		return null;
		
	}

     //delete Student
	
	public String deleteStudent(int id)
	{
		repo.deleteById(id);
		return "Student Deleted Successfully";
	}
}
