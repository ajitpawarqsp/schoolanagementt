package com.alpha.schoolmanagement;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true, length = 10)
    private String mobile;

    private int age;

    @Column(length = 10)
    private String gender;

    private double marks;

    // 🔹 No-argument constructor (required by JPA)
    public Student() {
    }

    // 🔹 Parameterized constructor
    public Student(String name, String mobile, int age, String gender, double marks) {
        this.name = name;
        this.mobile = mobile;
        this.age = age;
        this.gender = gender;
        this.marks = marks;
    }

    // 🔹 Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // 🔹 toString() method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", marks=" + marks +
                '}';
    }
}
