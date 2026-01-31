package com.example.TaskManagement.controller;

import com.example.TaskManagement.dto.TaskDTO;
import com.example.TaskManagement.model.Task;
import com.example.TaskManagement.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/tasks")
    public List<TaskDTO> getTasks() {
        return taskService.getTasks();
    }

    @RequestMapping("/tasks/{taskId}")
    public Task getbyid(@PathVariable int taskId) {
        return taskService.getTaskbyId(taskId);
    }

    @PostMapping("/tasks")
    public void addProduct(@RequestBody Task task) {
        taskService.addTask(task);
    }

    @PutMapping("/tasks")
    public void updateProduct(@RequestBody Task task) {
        taskService.addTask(task);
    }

    @DeleteMapping("/tasks/{taskId}")
    public void deletebyid(@PathVariable int taskId) {
        taskService.deleteTask(taskId);
    }





}
