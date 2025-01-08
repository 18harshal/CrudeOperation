package com.company.CrudOperation.entity;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
 @Column(nullable = false)
private String name;

 @Column(unique = true, nullable = true)
    private  String email;
 @Column(nullable = false)
 private String age;

@Column
 private  String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
