package com.example.projectmanage.Repository;

import com.example.projectmanage.Model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface userRepository extends JpaRepository<users, Long> {
      Optional<users> findByEmail(String email);
    Optional<users> findByPassword(String password);
    Boolean existsByEmail(String email);
}
