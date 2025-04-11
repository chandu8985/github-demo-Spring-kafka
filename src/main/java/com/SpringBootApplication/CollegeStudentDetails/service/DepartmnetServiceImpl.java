package com.SpringBootApplication.CollegeStudentDetails.service;

import com.SpringBootApplication.CollegeStudentDetails.entity.Department;
import com.SpringBootApplication.CollegeStudentDetails.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmnetServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentItems(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartmentsById(Long departmentId, Department department) {

        Department depDB = departmentRepository.findById(departmentId).get();

        if (Objects.nonNull(department.getDepartmentName()) &&
                !"".equalsIgnoreCase(department.getDepartmentName())){
            depDB.setDepartmentName(department.getDepartmentName());
        }
        if (Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress())){
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }
        if (Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode())){
            depDB.setDepartmentCode(department.getDepartmentName());
        }
        return departmentRepository.save(depDB);
    }

    @Override
    public Department fetchDepartmentsByName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }

    @Override
    public Department fetchDepartmentsByCode(String departmentCode) {
        return departmentRepository.findByDepartmentCode(departmentCode);
    }

    @Override
    public Department fetchDepartmentByAddress(String departmentAddress) {
        return departmentRepository.findByDepartmentAddress(departmentAddress);
    }
}
