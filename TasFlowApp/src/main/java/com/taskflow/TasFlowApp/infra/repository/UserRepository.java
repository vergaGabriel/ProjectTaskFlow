package com.taskflow.TasFlowApp.infra.repository;

import com.taskflow.TasFlowApp.domain.entity.User;
import com.taskflow.TasFlowApp.infra.persistence.IUserRepository;

public class UserRepository {
    private final IUserRepository iUserRepository;

    public UserRepository(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    public void save(User user) {
        this.iUserRepository.save(user);
    }
}
