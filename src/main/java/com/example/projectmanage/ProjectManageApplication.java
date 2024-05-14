package com.example.projectmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

@SpringBootApplication
public class ProjectManageApplication {

        public static void main(String[] args) {
            SpringApplication.run(ProjectManageApplication.class, args);
    }
//    public static void main(String a[]) {
//        int numberOfCharactor = 8;
//        ProjectManageApplication rand = new ProjectManageApplication();
//        System.out.println("randomString1: " + rand.randomAlphaNumeric(numberOfCharactor));
//        System.out.println("randomString1: " + rand.randomAlphaNumeric(numberOfCharactor));
//        System.out.println("randomString1: " + rand.randomAlphaNumeric(numberOfCharactor));
//    }
//    private static final String alpha = "abcdefghijklmnopqrstuvwxyz"; // a-z
//    private static final String alphaUpperCase = alpha.toUpperCase(); // A-Z
//    private static final String digits = "0123456789"; // 0-9
//    private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;
//    private static Random generator = new Random();
//
//    /**
//     * Random string with a-zA-Z0-9, not included special characters
//     */
//    public String randomAlphaNumeric(int numberOfCharactor) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < numberOfCharactor; i++) {
//            int number = randomNumber(0, ALPHA_NUMERIC.length() - 1);
//            char ch = ALPHA_NUMERIC.charAt(number);
//            sb.append(ch);
//        }
//        return sb.toString();
//    }
//
//    public static int randomNumber(int min, int max) {
//        return generator.nextInt((max - min) + 1) + min;
//    }
}
