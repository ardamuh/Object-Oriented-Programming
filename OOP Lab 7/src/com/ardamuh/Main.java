package com.ardamuh;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Course course1 = new Course("First Course");
        Course course2 = new Course("Second Course");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        ArrayList<String> studentcourse1 = new ArrayList<String>();
        ArrayList<String> studentcourse2 = new ArrayList<String>();

        System.out.println("Number of students in First Course: " + course1.getNumberOfStudents());
        studentcourse1 = course1.getStudents();
        for(int i=0; i<studentcourse1.size(); ++i)
            System.out.print(studentcourse1.get(i) + ", ");

        System.out.println("\n\nNumber of students in Second Course: " + course2.getNumberOfStudents());
        studentcourse2 = course2.getStudents();
        for(int i=0; i<studentcourse2.size(); ++i)
            System.out.print(studentcourse2.get(i) + ", ");

        System.out.println("\n\nDrop students: Peter Jones from First course");
        course1.dropStudent("Peter Jones");

        System.out.println("Number of students in First Course: " + course1.getNumberOfStudents());
        studentcourse1 = course1.getStudents();

        for(int i=0; i<studentcourse1.size(); ++i) {
            if(i == studentcourse1.size() - 1) {
                System.out.print(studentcourse1.get(i));
            }
            else {
                System.out.print(studentcourse1.get(i) + ", ");
            }
        }
    }
}
