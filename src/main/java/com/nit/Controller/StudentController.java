package com.nit.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.Entity.StudentEntity;
import com.nit.Service.StudentService;

@RestController
public class StudentController
{
	@Autowired
    private StudentService studservice;
	
	@PostMapping("/Student")
	public StudentEntity  save(@RequestBody StudentEntity stud)
	{
	return studservice.insertStudent(stud);
	}
	
	@GetMapping("/Student")
	public List<StudentEntity> getAll()
	{
	return	studservice.getAllStudent();
	}

	@PutMapping("/Student/{id}")
	public StudentEntity updateStudent(@PathVariable int id,@RequestBody StudentEntity stud)
	{
	return	studservice.updateStudent(id, stud);
	}
	
	@DeleteMapping("/Student/{id}")
	public String delete(@PathVariable int id)
	{
		return studservice.deleteStudent(id);
	}
	
}
