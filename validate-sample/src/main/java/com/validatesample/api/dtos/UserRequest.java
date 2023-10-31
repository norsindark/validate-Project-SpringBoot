package com.validatesample.api.dtos;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

    @NotNull(message = "Username shouldn't be null")
    private String userName;

    @NotNull(message = "Password shouldn't be null")
    @Pattern(regexp = "^.{6,}$", message = "Password more than 6 character")
    private String passWord;

    @Email(message = "invalid email address")
    private String email;

    @Pattern(regexp = "^\\d{10}$", message = "invalid phone number entered")
    private String phone;


    private String gender;

    @Max(80)
    @Min(18)
    private Integer age;
}
