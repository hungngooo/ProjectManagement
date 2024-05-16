package com.example.projectmanage.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;
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

    @OneToMany(mappedBy = "project")
    @JsonIgnore
    private Set<task> task;


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

    public Set<com.example.projectmanage.Model.task> getTask() {
        return task;
    }

    public void setTask(Set<com.example.projectmanage.Model.task> task) {
        this.task = task;
    }
}
