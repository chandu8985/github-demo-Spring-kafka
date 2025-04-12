package com.SpringBootApplication.CollegeStudentDetails.controller;


import com.SpringBootApplication.CollegeStudentDetails.entity.Department;
import com.SpringBootApplication.CollegeStudentDetails.error.DepartmentNotFoundException;
import com.SpringBootApplication.CollegeStudentDetails.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/saveDetails")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("this is under save department API");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/getAllData")
    public List<Department> fetchAllDepartments() {
        LOGGER.info("this is under fetch list of  department API");
        return departmentService.fetchAllDepartments();
    }

    @GetMapping("/getDepartmentsBy/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        LOGGER.info("this is under fetch list of  department by id  API");

        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/deletedDataByid/{id}")
    public String deleteDepartmentItems(@PathVariable("id") Long departmentId) {
        LOGGER.warn("this is under delete department API");

        departmentService.deleteDepartmentItems(departmentId);
        return " sucessfully you deleted the data ";
    }


    @PutMapping("/departments/{id}")
    public Department updateDepartmentsById(@PathVariable("id") Long departmentId,
                                            @RequestBody Department department) {
        LOGGER.info("this is under  update department API");

        return departmentService.updateDepartmentsById(departmentId, department);

    }
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentsByName(@PathVariable("name") String departmentName) {
        LOGGER.warn("this is under fetch department  by Name API");

        return departmentService.fetchDepartmentsByName(departmentName);
    }
    @GetMapping("/department/code/{code}")
    public Department fetchDepartmentsByCode(@PathVariable("code") String departmentCode){
        LOGGER.warn("this is under fetch department  by code API");

        return  departmentService.fetchDepartmentsByCode(departmentCode);
    }
    @GetMapping("/departments/address/{address}")
    public Department fetchDepartmentByAddress(@PathVariable("address") String departmentAddress){
        LOGGER.warn("this is under fetch department  by address API");

        return departmentService.fetchDepartmentByAddress(departmentAddress);
    }
}