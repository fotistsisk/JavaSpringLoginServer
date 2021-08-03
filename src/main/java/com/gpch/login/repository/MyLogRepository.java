package com.gpch.login.repository;

import com.gpch.login.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyLogRepository extends JpaRepository<Role, Integer> {

}

