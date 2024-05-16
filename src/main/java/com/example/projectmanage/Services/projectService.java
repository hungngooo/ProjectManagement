package com.example.projectmanage.Services;

import com.example.projectmanage.Model.projects;
import com.example.projectmanage.Repository.projectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class projectService {
    @Autowired
    private projectRepository projectRepository;
    public List<projects> getAllProject() {return projectRepository.findAll();}
    public projects addNewProject(projects projects){
        return projectRepository.save(projects);
    }
}
