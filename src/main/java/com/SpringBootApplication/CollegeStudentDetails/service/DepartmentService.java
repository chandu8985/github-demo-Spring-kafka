package com.SpringBootApplication.CollegeStudentDetails.service;

import com.SpringBootApplication.CollegeStudentDetails.entity.Department;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);

 public  List<Department> fetchAllDepartments();
}
