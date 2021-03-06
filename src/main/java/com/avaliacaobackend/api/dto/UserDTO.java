package com.avaliacaobackend.api.dto;

import com.avaliacaobackend.domain.model.Person;
import com.avaliacaobackend.domain.model.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    @NotEmpty(message = "{username.notempty}")
    private String username;

    @NotEmpty(message = "{email.notempty}")
    @Email
    private String email;

    @NotEmpty(message = "{password.notempty}")
    private String password;

    private LocalDateTime createdAt;

    @Valid
    private Person person;

    public User transformToObject() {
        return new User(username, email, password, createdAt, person);
    }

}
