package com.example.JAVA_SPRING_PHONESHOP.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JAVA_SPRING_PHONESHOP.domain.Order;
import com.example.JAVA_SPRING_PHONESHOP.domain.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}
