package com.example.projectmanage.Controller;

import com.example.projectmanage.Model.projects;
import com.example.projectmanage.Services.projectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/projects")
public class projectController {
    @Autowired
    private projectService projectService;
    @GetMapping("/getProject")
    public ResponseEntity<List<projects>> getProject(){
        return new ResponseEntity<>(projectService.getAllProject(), HttpStatus.OK);
    }

    @PostMapping("/createProject")
    public ResponseEntity<projects> createProject(@RequestBody projects projects){
        projects.setCode(randomAlphaNumeric(6));
        return new ResponseEntity<>(projectService.addNewProject(projects), HttpStatus.CREATED);
    }
    private static final String alpha = "abcdefghijklmnopqrstuvwxyz"; // a-z
    private static final String alphaUpperCase = alpha.toUpperCase(); // A-Z
    private static final String digits = "0123456789"; // 0-9
    private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;
    private static Random generator = new Random();
    public String randomAlphaNumeric(int numberOfCharactor) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfCharactor; i++) {
            int number = randomNumber(0, ALPHA_NUMERIC.length() - 1);
            char ch = ALPHA_NUMERIC.charAt(number);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static int randomNumber(int min, int max) {
        return generator.nextInt((max - min) + 1) + min;
    }
}
