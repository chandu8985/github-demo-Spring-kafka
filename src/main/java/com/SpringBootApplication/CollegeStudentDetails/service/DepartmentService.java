package com.SpringBootApplication.CollegeStudentDetails.service;

import com.SpringBootApplication.CollegeStudentDetails.entity.Department;
import com.SpringBootApplication.CollegeStudentDetails.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);

 public  List<Department> fetchAllDepartments();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

   public void deleteDepartmentItems(Long departmentId);

   public Department updateDepartmentsById(Long departmentId, Department department);

    public Department fetchDepartmentsByName(String departmentName);

    public Department fetchDepartmentsByCode(String departmentCode);

    public Department fetchDepartmentByAddress(String departmentAddress);
}
