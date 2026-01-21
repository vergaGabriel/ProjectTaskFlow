package com.taskflow.TasFlowApp.application.controller;

import com.taskflow.TasFlowApp.application.dto.UserDto;
import com.taskflow.TasFlowApp.usecase.CreateUserUseCase;
import com.taskflow.TasFlowApp.usecase.LoginUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class UserController {
    private final CreateUserUseCase createUserUseCase;
    private final LoginUserUseCase loginUserUseCase;

    @PostMapping("create")
    public void save(@RequestBody UserDto user) {
        this.createUserUseCase.execute(user);
    }

    @GetMapping("login")
    public void login(@RequestBody String email, String password) {
        this.loginUserUseCase.execute(email, password);
    }
}
