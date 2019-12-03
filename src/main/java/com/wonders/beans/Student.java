package com.wonders.beans;

public class Student extends Person {
    private String grade;

    public Student() {

    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "com.wonders.beans.Student{" +
                "grade='" + grade + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
