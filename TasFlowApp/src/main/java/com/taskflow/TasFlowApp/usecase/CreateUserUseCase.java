package com.taskflow.TasFlowApp.usecase;


import com.taskflow.TasFlowApp.application.dto.UserDto;
import com.taskflow.TasFlowApp.domain.entity.User;
import com.taskflow.TasFlowApp.infra.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserUseCase {
    private final UserRepository userRepository;

    public void execute(UserDto userDto) {
        User user = User.builder()
                .name(userDto.name)
                .email(userDto.email)
                .password(userDto.password)
                .phone(userDto.phone)
                .build();
        this.userRepository.save(user);
    }
}
