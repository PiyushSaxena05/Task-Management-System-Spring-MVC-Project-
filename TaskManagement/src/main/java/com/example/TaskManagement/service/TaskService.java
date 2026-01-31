package com.example.TaskManagement.service;

import com.example.TaskManagement.dto.TaskDTO;
import com.example.TaskManagement.model.Task;
import com.example.TaskManagement.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Service
public class TaskService {

    @Autowired
    TaskRepo taskRepo;

   // List<Task>tasks = new ArrayList<>(Arrays.asList(new Task(101,"Ramesh","DSA")));

//    public List<Task>getTasks(){
//        return taskRepo.findAll();
//    }
    public List<TaskDTO> getTasks() {
        return taskRepo.findAll()
                .stream()
                .map(task -> new TaskDTO(
                        task.getTaskId(),
                        task.getUserName(),
                        task.getTaskName(),
                        task.getTarget(),
                        task.getCompleted()
                ))
                .collect(Collectors.toList());
    }

    public TaskDTO getTaskById(int taskId) {
        Task task = taskRepo.findById(taskId).orElseThrow();
        return new TaskDTO(
                task.getTaskId(),
                task.getUserName(),
                task.getTaskName(),
                task.getTarget(),
                task.getCompleted()
        );
    }


    public void addTask(Task task){
        taskRepo.save(task);
    }
    public void updateTask(Task task){
        taskRepo.save(task);
    }
    public void deleteTask(int id){
        taskRepo.deleteById(id);
    }

    public Task getTaskbyId(int id){
        return taskRepo.findById(id).orElse(new Task());
    }



}
