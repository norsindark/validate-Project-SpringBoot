package com.validatesample.api.repositories;

import com.validatesample.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(Integer userId);
}
