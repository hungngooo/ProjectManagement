package com.example.projectmanage.Controller;

import com.example.projectmanage.Model.task;
import com.example.projectmanage.Services.taskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class taskController {
    @Autowired
    private taskService taskService;
    @GetMapping("/getTask")
    public ResponseEntity<List<task>> getTask(String code){
        return new ResponseEntity<>(taskService.getTask(code), HttpStatus.OK);
    }
    @GetMapping("/getAlltask")
    public ResponseEntity<List<task>> getAllTask(){
        return new ResponseEntity<>(taskService.getAllTask(), HttpStatus.OK);
    }
}
