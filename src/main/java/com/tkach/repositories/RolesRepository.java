package com.tkach.repositories;

import com.tkach.model.Roles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RolesRepository extends CrudRepository<Roles, Integer> {
    List<Roles> findByName(String name);
}
