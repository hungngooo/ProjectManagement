package com.example.projectmanage.Model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "task")
public class task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    //    @OneToMany(mappedBy = "task")
//    private Set<projects> project;
    @ManyToOne
    @JoinColumn(name = "project_Id")
    @JsonIgnore
    private projects project;

    public projects getProject() {
        return project;
    }

    public void setProject(projects project) {
        this.project = project;
    }

    @ManyToMany
    @JoinTable(
            name = "task_user",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<users> users;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
