package com.tkach.repositories;

import com.tkach.model.Request;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RequestRepository extends CrudRepository<Request, Integer> {
    List<Request> findByDateReq(String dateReq);
}
