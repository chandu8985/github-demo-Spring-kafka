package com.SpringBootApplication.CollegeStudentDetails.service;

import com.SpringBootApplication.CollegeStudentDetails.entity.Department;
import com.SpringBootApplication.CollegeStudentDetails.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Description;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmnetServiceImplTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;
    @BeforeEach
    void setUp(){
        Department department
                = Department.builder()
                .departmentName("CSE")
                .departmentAddress("Ananthapur")
                .departmentCode("CSE-02")
                .departmentId(1L)
                .build();

        Mockito.when(departmentRepository.findByDepartmentName("CSE"))
                .thenReturn(department);
    }
    @Test
    @DisplayName("get Department Details when valid department name ")
    public void whenValidDepartmentNameThenreturnDepartment(){

        String departmnetName = "CSE";
        Department found =departmentService.fetchDepartmentsByName(departmnetName);
        assertEquals(departmnetName , found.getDepartmentName());
    }

}