package com.backend.repositories;

import com.backend.entities.User;
import com.backend.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserRole(UserRole role);

    Optional<User> findByEmail(String email);
}
