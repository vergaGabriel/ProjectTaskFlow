package com.taskflow.TasFlowApp.infra.persistence;

import com.taskflow.TasFlowApp.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<User, UUID> {
}
