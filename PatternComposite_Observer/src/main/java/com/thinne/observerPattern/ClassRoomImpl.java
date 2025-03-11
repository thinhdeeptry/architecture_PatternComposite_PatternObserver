package com.thinne.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomImpl implements Classroom{
    private List<Student> students = new ArrayList<>();
    private String message;

    @Override
    public void attach(Student student) {
        students.add(student);
    }

    @Override
    public void detach(Student student) {
        students.remove(student);
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
        notifycationAllStudents();
    }

    @Override
    public void notifycationAllStudents() {
        for (Student student : students) {
            student.update(message);
        }
    }
}
