package com.taskflow.TasFlowApp.infra.repository;

import com.taskflow.TasFlowApp.domain.entity.User;
import com.taskflow.TasFlowApp.infra.persistence.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserRepository {
    private final IUserRepository iUserRepository;

    public void save(User user) {
        this.iUserRepository.save(user);
    }

    public List<User> getAll() {
        return this.iUserRepository.findAll();
    }

    public User getUserByEmail(String userEmail) {
        return this.iUserRepository.getUserByEmail(userEmail);
    }
}
