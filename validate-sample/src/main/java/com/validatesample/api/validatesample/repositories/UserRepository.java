package com.validatesample.api.validatesample.repositories;

import com.validatesample.api.validatesample.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(Integer userId);
}
