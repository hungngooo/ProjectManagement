package com.example.projectmanage.Repository;

import com.example.projectmanage.Model.projects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface projectRepository extends JpaRepository<projects, String> {
}
