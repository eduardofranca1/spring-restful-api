package com.avaliacaobackend.api.dto;

import com.avaliacaobackend.domain.model.Person;
import com.avaliacaobackend.domain.model.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    @NotEmpty(message = "{NotEmpty.userName}")
    private String username;

    @NotEmpty(message = "{NotEmpty.email}")
    @Email
    private String email;

    @NotEmpty(message = "{NotEmpty.password}")
    private String password;

    private LocalDateTime createdAt;

    private Person person;

    public User transformToObject() {
        return new User(username, email, password, createdAt, person);
    }

}