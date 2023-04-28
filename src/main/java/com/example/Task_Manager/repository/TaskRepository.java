package com.example.Task_Manager.repository;

import com.example.Task_Manager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface TaskRepository extends JpaRepository<Task,Long> {

    @Query(value = "SELECT t.id, t.patient_id, t.task, t.due_date, t.status, t.comment, o.task_id, o.owner, o.priority FROM task t JOIN owner o ON t.id = o.task_id",nativeQuery = true)
    List<Map<String,String>> viewAllTasks();
}
