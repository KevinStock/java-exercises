package org.launchcode.java.school;

/**
 * Created by kevinstock on 3/16/17.
 */
public class School {
    public static void main(String[] args) {
        Student s1 = new Student("Kevin");
        Student s2 = new Student("John");

        Course c1 = new Course("Java 101", 4);

        c1.addStudent(s1);
        c1.addStudent(s2);

        System.out.println(c1);

        System.out.println(s1);
    }
}
