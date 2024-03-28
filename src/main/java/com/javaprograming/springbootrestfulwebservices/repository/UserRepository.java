package com.javaprograming.springbootrestfulwebservices.repository;

import com.javaprograming.springbootrestfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
