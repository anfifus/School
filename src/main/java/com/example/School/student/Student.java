package com.example.School.student;

public class Student {
    private long id;
    private String name;
    private String surname;

    public Student() {
    }

    public Student(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}
