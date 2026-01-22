package com.taskflow.TasFlowApp.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Task {
    @Id
    private String id;
    private StatusTask statusTask;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;
}
