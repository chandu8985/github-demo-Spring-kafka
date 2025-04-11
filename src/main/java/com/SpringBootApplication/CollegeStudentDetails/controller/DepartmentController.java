package com.SpringBootApplication.CollegeStudentDetails.controller;


import com.SpringBootApplication.CollegeStudentDetails.entity.Department;
import com.SpringBootApplication.CollegeStudentDetails.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/saveDetails")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/getAllData")
    public List<Department> fetchAllDepartments() {
        return departmentService.fetchAllDepartments();
    }

    @GetMapping("/getDepartmentsBy/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {

        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/deletedDataByid/{id}")
    public String deleteDepartmentItems(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentItems(departmentId);
        return " sucessfully you deleted the data ";
    }


    @PutMapping("/departments/{id}")
    public Department updateDepartmentsById(@PathVariable("id") Long departmentId,
                                            @RequestBody Department department) {
        return departmentService.updateDepartmentsById(departmentId, department);

    }
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentsByName(@PathVariable("name") String departmentName) {

        return departmentService.fetchDepartmentsByName(departmentName);
    }
    @GetMapping("/department/code/{code}")
    public Department fetchDepartmentsByCode(@PathVariable("code") String departmentCode){

        return  departmentService.fetchDepartmentsByCode(departmentCode);
    }
    @GetMapping("/departments/address/{address}")
    public Department fetchDepartmentByAddress(@PathVariable("address") String departmentAddress){
        return departmentService.fetchDepartmentByAddress(departmentAddress);
    }

}