package com.example.projectmanage.Repository;

import com.example.projectmanage.Model.task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface taskRepository extends JpaRepository<task,Long> {
    @Query("SELECT t FROM task t where t.project.code = :code")
    List<task> findtaskByProjectCode(@Param("code") String projectCode);
}
