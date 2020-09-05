package com.valdemar.FirstProject.controller;

import com.valdemar.FirstProject.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    private final TaskService taskService;

    public MainController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/main")
    public String showMainPage(){
        return "/main-page";
    }
}
