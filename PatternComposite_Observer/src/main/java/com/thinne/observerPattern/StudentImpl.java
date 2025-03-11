package com.thinne.observerPattern;

public class StudentImpl implements Student{
    private String name;
    public StudentImpl(String name) {
        this.name = name;
    }

    @Override

    public void update(String message) {
        System.out.println("Message for student: " + message);
    }
}
