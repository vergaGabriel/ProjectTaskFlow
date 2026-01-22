package com.taskflow.TasFlowApp.usecase.User;

import com.taskflow.TasFlowApp.application.dto.UserDto;
import com.taskflow.TasFlowApp.domain.entity.User;
import com.taskflow.TasFlowApp.infra.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserUseCase {
    private final UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public void execute(UserDto userDto) {
        User user = User.builder()
                .name(userDto.name)
                .email(userDto.email)
                .password(passwordEncoder.encode(userDto.password))
                .phone(userDto.phone)
                .build();

        this.userRepository.save(user);
    }
}
