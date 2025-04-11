package com.SpringBootApplication.CollegeStudentDetails.repository;

import com.SpringBootApplication.CollegeStudentDetails.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department , Long> {


public Department findByDepartmentName(String departmentName);

public Department findByDepartmentCode(String departmentCode);

public Department findByDepartmentAddress(String departmentAddress);
//public Department findByDepartmentIdEqualsIgnoreCase
// public Department findByDepartmentAddressEqualsIgnoreCase(String departmentAddress);
}
