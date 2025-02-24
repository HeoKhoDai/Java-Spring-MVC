package com.example.JAVA_SPRING_PHONESHOP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JAVA_SPRING_PHONESHOP.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
