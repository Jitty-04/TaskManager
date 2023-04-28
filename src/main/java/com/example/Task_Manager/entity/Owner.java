package com.example.Task_Manager.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "owner")
public class Owner extends Abstract {
    private int task_id;
    private String owner;
    private String priority;

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
