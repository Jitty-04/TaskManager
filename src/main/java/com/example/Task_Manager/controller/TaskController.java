package com.example.Task_Manager.controller;

import com.example.Task_Manager.entity.Task;
import com.example.Task_Manager.repository.TaskRepository;
import com.example.Task_Manager.services.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TaskController {
@Autowired
    TaskServiceImpl taskServiceImpl;


@CrossOrigin(origins = "*")
    @GetMapping(path = "/viewAllTasks")
    public List<Map<String,String>> viewAllTasks()
    {

        return taskServiceImpl.viewAllTask();
    }

   //@CrossOrigin(origins = "*")
    //@GetMapping(path = "/updatedues", consumes="application/json",produces ="applocation/json" )
    //public HashMap<String,String> updateDues(@RequestBody Task task)
    //{
        //TaskServiceImpl.updateDues(task.getDue_date(),task.getPatient_id(),task.getId());
       // HashMap<String,String> map=new HashMap<>();
      // map.put("status","success");
   // }


}

