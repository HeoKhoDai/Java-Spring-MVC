package com.example.JAVA_SPRING_PHONESHOP.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.JAVA_SPRING_PHONESHOP.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User user);
}
