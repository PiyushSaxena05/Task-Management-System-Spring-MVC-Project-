package com.example.TaskManagement.dto;

import lombok.Data;

@Data
public class TaskDTO {
    private int taskId;
    private String userName;
    private String taskName;
    private int target;
    private int completed;

    public TaskDTO(int taskId, String userName, String taskName, int target, int completed) {
        this.taskId = taskId;
        this.userName = userName;
        this.taskName = taskName;
        this.target = target;
        this.completed = completed;
    }
}
