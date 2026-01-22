package com.taskflow.TasFlowApp.usecase.Task;

import com.taskflow.TasFlowApp.application.dto.TaskDto;
import com.taskflow.TasFlowApp.domain.entity.Task;
import com.taskflow.TasFlowApp.domain.entity.User;
import com.taskflow.TasFlowApp.infra.repository.TaskRepository;
import com.taskflow.TasFlowApp.infra.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateTaskUseCase {
    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    public void execute(TaskDto taskDto) {
        User user = userRepository.getUserById(taskDto.userId);
        Task task = Task.builder()
                .statusTask(taskDto.statusTask)
                .description(taskDto.description)
                .userId(user)
                .build();

        taskRepository.save(task);
    }
}
