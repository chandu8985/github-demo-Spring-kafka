package com.SpringBootApplication.CollegeStudentDetails.controller;

import com.SpringBootApplication.CollegeStudentDetails.entity.Department;
import com.SpringBootApplication.CollegeStudentDetails.repository.DepartmentRepository;
import com.SpringBootApplication.CollegeStudentDetails.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping("/saveDetails")
    public Department saveDepartment(@RequestBody Department department){
       return departmentService.saveDepartment(department);
    }

    @GetMapping("/getAllData")
public List<Department> fetchAllDepartments(){
return departmentService.fetchAllDepartments();
}

@DeleteMapping("/deletedData")
public String deleteItems(){
        return " sucessfully you deleted the data ";
}



}
