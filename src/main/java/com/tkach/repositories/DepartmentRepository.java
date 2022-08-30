package com.tkach.repositories;

import com.tkach.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {
        List<Department> findByName(String name);
        }
