package com.taskflow.TasFlowApp.usecase.Task;

import com.taskflow.TasFlowApp.application.dto.TaskDto;
import com.taskflow.TasFlowApp.domain.entity.StatusTask;
import com.taskflow.TasFlowApp.domain.entity.Task;
import com.taskflow.TasFlowApp.domain.entity.User;
import com.taskflow.TasFlowApp.infra.repository.TaskRepository;
import com.taskflow.TasFlowApp.infra.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
@RequiredArgsConstructor
public class CreateTaskUseCase {
    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    public void execute(TaskDto taskDto) {
        User user = userRepository.getUserById(taskDto.userId);
        Task task = Task.builder()
                .statusTask(StatusTask.UNASSIGNED)
                .description(taskDto.description)
                .creationDate(LocalDate.now())
                .updatedDate(LocalDate.now())
                .creatorUserId(user)
                .build();

        taskRepository.save(task);
    }
}
