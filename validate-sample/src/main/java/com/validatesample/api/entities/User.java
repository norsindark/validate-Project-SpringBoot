package com.validatesample.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Integer userId;

    private String userName;
    private String passWord;
    private String email;
    private String phone;
    private String gender;
    private Integer age;
}
