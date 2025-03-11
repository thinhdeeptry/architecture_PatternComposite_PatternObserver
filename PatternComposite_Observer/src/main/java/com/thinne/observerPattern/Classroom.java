package com.thinne.observerPattern;

import java.util.List;

public interface Classroom {
    void attach(Student student);
    void detach(Student student);
    void setMessage(String message);
    void notifycationAllStudents();
}
