package org.launchcode.java.school;

/**
 * Created by kevinstock on 3/11/17.
 */
public class Student {

    private String name;
    private int studentId;
    private int credits;
    private double gpa;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.credits = 0;
        this.gpa = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits += credits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
