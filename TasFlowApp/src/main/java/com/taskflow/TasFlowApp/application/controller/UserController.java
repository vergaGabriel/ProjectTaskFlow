package com.taskflow.TasFlowApp.application.controller;

import com.taskflow.TasFlowApp.application.dto.UserDto;
import com.taskflow.TasFlowApp.usecase.CreateUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class UserController {
    private final CreateUserUseCase createUserUseCase;

    @PostMapping("create")
    public void save(@RequestBody UserDto user) {
        this.createUserUseCase.execute(user);
    }
}
