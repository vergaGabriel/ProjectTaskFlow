package com.taskflow.TasFlowApp.application.controller;

import com.taskflow.TasFlowApp.application.dto.TaskDto;
import com.taskflow.TasFlowApp.usecase.Task.CreateTaskUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tasks")
@RequiredArgsConstructor
public class TaskController {
    private final CreateTaskUseCase createTaskUseCase;

    @PostMapping("/create")
    public void save(@RequestBody TaskDto taskDto) {
        createTaskUseCase.execute(taskDto);
    }
}
