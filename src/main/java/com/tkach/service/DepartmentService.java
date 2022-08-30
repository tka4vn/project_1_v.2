package com.tkach.service;

import com.tkach.model.Department;
import com.tkach.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public void delete(Department department
    ) {
        departmentRepository.delete(department);
    }
}
