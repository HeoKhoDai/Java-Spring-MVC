package com.example.JAVA_SPRING_PHONESHOP.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JAVA_SPRING_PHONESHOP.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);

}
