package com.taskflow.TasFlowApp.infra.repository;

import com.taskflow.TasFlowApp.domain.entity.Task;
import com.taskflow.TasFlowApp.infra.persistence.ITaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TaskRepository {
    private final ITaskRepository iTaskRepository;

    public void save(Task task) {
        this.iTaskRepository.save(task);
    }

    public Task getByTaskId(String id) {
        return this.iTaskRepository.getTasksById(id);
    }
}
