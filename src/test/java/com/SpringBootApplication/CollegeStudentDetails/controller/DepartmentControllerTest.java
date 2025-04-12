package com.SpringBootApplication.CollegeStudentDetails.controller;

import com.SpringBootApplication.CollegeStudentDetails.entity.Department;
import com.SpringBootApplication.CollegeStudentDetails.error.DepartmentNotFoundException;
import com.SpringBootApplication.CollegeStudentDetails.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    private Department department;
    @BeforeEach
    void setUp() {
         department = Department.builder()
                 .departmentAddress("Varakala")
                 .departmentCode("VAR -45")
                 .departmentName("CSE-00")
                 .departmentId(1L)
                 .build();


    }

    @Test
    @DisplayName("when giving the save department details : ")
    void saveDepartment() throws Exception {
        Department inputDepartment = Department.builder()
                .departmentAddress("Varakala")
                .departmentCode("VAR -45")
                .departmentName("CSE-00")
                .departmentId(1L)
                .build();
        Mockito.when(departmentService.saveDepartment(inputDepartment))
                .thenReturn(department);

        mockMvc.perform(post("/saveDetails")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "\"departmentName\":\"CSE-00\",\n" +
                        "\"departmentAddress\":\"Varakala\",\n" +
                        "\"departmentCode\":\"VAR -45\"\n" +
                        "}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName(" when get the departments by specific id or recod details ")
    void fetchDepartmentById() throws Exception {

        Mockito.when(departmentService.fetchDepartmentById(1L))
                .thenReturn(department);

        mockMvc.perform(get("/getDepartmentsBy/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.departmentName")
                        .value(department.getDepartmentName()));

    }
}