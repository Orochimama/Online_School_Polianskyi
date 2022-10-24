package com.onlineSchool.classes;

public class Course {
    public static int courseId = 0;

    private Lecture lecture;
    private Student student;
    private Teacher teacher;

    public Course() {
        courseId++;
    }
}
