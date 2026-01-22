package com.taskflow.TasFlowApp.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;

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
    private TagTask tagTask;
    private String name;
    private String description;
    private LocalDate creationDate;
    private LocalDate updatedDate;

    @ManyToOne
    @JoinColumn(name = "creator_user_id")
    private User creatorUserId;

    @ManyToOne
    @JoinColumn(name = "assigned_user_id")
    private User assignedUserId;
}
