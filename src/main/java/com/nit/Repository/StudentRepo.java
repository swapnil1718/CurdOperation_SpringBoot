package com.nit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.Entity.StudentEntity;

@Repository
public interface StudentRepo extends CurdRepository<StudentEntity, Integer>
{

	
}
