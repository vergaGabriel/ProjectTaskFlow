package com.taskflow.TasFlowApp.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class User {
    @Id
    private String id;
    @NotNull
    private String name;
    @Email
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    @Column(unique = true, nullable = false)
    private String phone;

    @OneToMany(mappedBy = "created_task_id")
    private Set<Task> createdTasks = new HashSet<>();

    @OneToMany(mappedBy = "assigend_task_id")
    private Set<Task> assignedTasks = new HashSet<>();
}
