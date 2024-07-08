package com.productorder.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.productorder.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
