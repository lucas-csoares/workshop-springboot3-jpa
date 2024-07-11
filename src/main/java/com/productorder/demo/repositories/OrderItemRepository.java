package com.productorder.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.productorder.demo.entities.OrderItem;
import com.productorder.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
}
