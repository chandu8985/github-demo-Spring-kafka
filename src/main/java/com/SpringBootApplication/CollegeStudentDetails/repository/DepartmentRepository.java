package com.SpringBootApplication.CollegeStudentDetails.repository;

import com.SpringBootApplication.CollegeStudentDetails.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department , Long> {








}
