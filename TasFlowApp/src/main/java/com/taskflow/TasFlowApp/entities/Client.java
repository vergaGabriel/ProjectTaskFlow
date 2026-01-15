package com.taskflow.TasFlowApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Client {
    @Id
    private String id;
    @NotNull
    private String name;
    @Email
    @NotNull
    private String email;
    private String password;
    @NotNull
    private String phone;
}
