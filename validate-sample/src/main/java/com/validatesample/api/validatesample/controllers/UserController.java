package com.validatesample.api.validatesample.controllers;

import com.validatesample.api.validatesample.dtos.UserRequest;
import com.validatesample.api.validatesample.entities.User;
import com.validatesample.api.validatesample.exception.UserNotFoundException;
import com.validatesample.api.validatesample.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/fetchAll")
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok(this.userService.getAllUser());
    }

    @PostMapping("/create")
    public ResponseEntity<User> createNewUser(@Valid @RequestBody UserRequest userRequest) {
        return new ResponseEntity<>(this.userService.createNewUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById( @PathVariable Integer id) throws UserNotFoundException {
        return ResponseEntity.ok(this.userService.getUserById(id));
    }

}
