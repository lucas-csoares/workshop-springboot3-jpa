package com.productorder.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.productorder.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
