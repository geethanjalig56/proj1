package com.stud01.entityfld01;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "student01")
public class entitycls01 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long rollno01;
    private String name01;

    public entitycls01() 
    {
    }

    public entitycls01(Long id, Long rollno01, String name01) {
        this.id = id;
        this.rollno01 = rollno01;
        this.name01 = name01;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getrollno01() {
        return rollno01;
    }

    public void setrollno01(Long rollno01) {
        this.rollno01 = rollno01;
    }

    public String getname01() {
        return name01;
    }

    public void setname01(String name01) {
        this.name01 = name01;
    }
}