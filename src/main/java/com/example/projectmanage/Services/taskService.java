package com.example.projectmanage.Services;

import com.example.projectmanage.Model.task;
import com.example.projectmanage.Repository.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class taskService {
    @Autowired
    private taskRepository taskRepository;
    public List<task> getTask(String projectCode){
        return taskRepository.findtaskByProjectCode(projectCode);
    }
    public List<task> getAllTask(){
        return taskRepository.findAll();
    }
}
