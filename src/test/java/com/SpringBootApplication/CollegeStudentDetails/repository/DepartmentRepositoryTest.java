package com.SpringBootApplication.CollegeStudentDetails.repository;

import com.SpringBootApplication.CollegeStudentDetails.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("IT")
                        .departmentCode("IT-55")
                        .departmentAddress("KErala")
                        .build();
        entityManager.persist(department);

    }
    @Test
    @DisplayName("the valid Department then retrn Repository layer data")
    public void whenDepartmentIdIsPresentThenReturnDepartemnt(){

        Department department = departmentRepository.findById(1L).get();
        assertEquals("IT", department.getDepartmentName());
    }

}