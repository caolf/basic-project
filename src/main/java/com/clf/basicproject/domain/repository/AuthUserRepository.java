package com.clf.basicproject.domain.repository;

import com.clf.basicproject.domain.entity.AuthUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthUserRepository extends JpaRepository<AuthUserEntity, Long> {
    AuthUserEntity findFirstByUsername(String username);
}
