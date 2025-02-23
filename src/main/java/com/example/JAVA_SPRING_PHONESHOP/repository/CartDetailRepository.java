package com.example.JAVA_SPRING_PHONESHOP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JAVA_SPRING_PHONESHOP.domain.Cart;
import com.example.JAVA_SPRING_PHONESHOP.domain.CartDetail;
import com.example.JAVA_SPRING_PHONESHOP.domain.Product;

@Repository
public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {
    boolean existsByCartAndProduct(Cart cart, Product product);

    CartDetail findByCartAndProduct(Cart cart, Product product);
}
