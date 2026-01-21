package com.taskflow.TasFlowApp.infra.persistence;


import com.taskflow.TasFlowApp.domain.entity.Task;
import com.taskflow.TasFlowApp.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ITaskRepository extends JpaRepository<Task, UUID> {
    List<Task> getTasksByUserId(User userId);

    Task getTasksById(String id);
}
