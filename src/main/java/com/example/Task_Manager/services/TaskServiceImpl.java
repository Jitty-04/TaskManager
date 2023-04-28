package com.example.Task_Manager.services;

import com.example.Task_Manager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service

public class TaskServiceImpl implements TaskService{
    @Autowired
    TaskRepository taskRepository;
    @Override
    public List<Map<String,String>> viewAllTask(){
        return taskRepository.viewAllTasks();
    }




}
