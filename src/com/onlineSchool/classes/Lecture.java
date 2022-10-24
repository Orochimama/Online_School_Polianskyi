package com.onlineSchool.classes;

public class Lecture {
    public static int lectureId = 0;

    private Homework homework;
    private AdditionelMaterials additionelMaterials;

    public Lecture() {
        lectureId++;
    }
}
