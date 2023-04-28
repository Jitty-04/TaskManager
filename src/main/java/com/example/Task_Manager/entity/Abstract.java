package com.example.Task_Manager.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Abstract {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    public long getId(){
        return id;
    }
    public void setId(long id) {this.id=id;}
}
