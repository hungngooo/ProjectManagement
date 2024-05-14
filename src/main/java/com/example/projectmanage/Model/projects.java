package com.example.projectmanage.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "projects")
public class projects {
    @Id
    @Column(unique = true)
    private String code;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @ManyToMany
    @JoinTable(
            name = "project_user",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<users> users;

    @ManyToOne
    @JoinColumn(name = "task_Id")
    private task task;

    public com.example.projectmanage.Model.task getTask() {
        return task;
    }

    public void setTask(com.example.projectmanage.Model.task task) {
        this.task = task;
    }

    public Set<com.example.projectmanage.Model.users> getUsers() {
        return users;
    }

    public void setUsers(Set<com.example.projectmanage.Model.users> users) {
        this.users = users;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
