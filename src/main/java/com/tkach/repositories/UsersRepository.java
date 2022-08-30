package com.tkach.repositories;

import com.tkach.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findByName(String name);
}
