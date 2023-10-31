package com.validatesample.api.services;

import com.validatesample.api.dtos.UserRequest;
import com.validatesample.api.entities.User;
import com.validatesample.api.exception.UserNotFoundException;
import com.validatesample.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {
        return this.userRepository.findAll();
    }

    public User createNewUser(UserRequest userRequest) {
        User user = User.build(0, userRequest.getUserName(), userRequest.getPassWord(),
                userRequest.getEmail(), userRequest.getPhone(), userRequest.getGender(), userRequest.getAge());
        return this.userRepository.save(user);
    }

    public User getUserById(Integer id) throws UserNotFoundException {
        User user = this.userRepository.findByUserId(id);
        if (user!=null) {
            return user;
        }
        else {
            throw new UserNotFoundException("User not found with id: "+id);
        }
    }


}
