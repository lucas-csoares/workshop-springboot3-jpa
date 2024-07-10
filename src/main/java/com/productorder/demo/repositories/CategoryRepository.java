package com.productorder.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productorder.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
