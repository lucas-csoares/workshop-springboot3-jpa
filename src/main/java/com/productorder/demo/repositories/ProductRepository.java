package com.productorder.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.productorder.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
