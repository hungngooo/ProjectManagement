package com.example.projectmanage.Repository;

import com.example.projectmanage.Model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface userRepository extends JpaRepository<users, Long> {
    @Query ("SELECT u FROM users u WHERE u.email = :email")
    boolean emailExist(@Param("email") String email);
}
