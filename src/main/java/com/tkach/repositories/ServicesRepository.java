package com.tkach.repositories;

import com.tkach.model.Services;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ServicesRepository extends CrudRepository<Services, Integer> {
    List<Services> findByName(String name);
    List<Services> findByIdSerRol(String idSerRol);
    List<Services> findByIdSerIng(String idSerIng);
}
