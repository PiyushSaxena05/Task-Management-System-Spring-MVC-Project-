package com.example.TaskManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Task {
    @Id
    private int taskId;
    private String userName;
    private String taskName;
    private int target;
    private int completed;

    public Task() {
    }
//    public Integer getTaskId() {
//        return taskId;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public String getTaskName() {
//        return taskName;
//    }

    public Task(int taskId,String userName, String taskName,int target,int completed) {
        this.taskId = taskId;
        this.userName = userName;
        this.taskName = taskName;
        this.target = target;
        this.completed = completed;
    }
}
