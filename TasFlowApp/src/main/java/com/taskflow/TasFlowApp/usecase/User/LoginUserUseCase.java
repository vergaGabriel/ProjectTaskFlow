package com.taskflow.TasFlowApp.usecase.User;

import com.taskflow.TasFlowApp.domain.entity.User;
import com.taskflow.TasFlowApp.infra.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginUserUseCase {
    private final UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public boolean execute(String email, String password) {
        User user = userRepository.getUserByEmail(email);
        return passwordEncoder.matches(password, user.getPassword());
    }
}
