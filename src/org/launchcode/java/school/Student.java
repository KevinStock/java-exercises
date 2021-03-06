package org.launchcode.java.school;

import java.util.Objects;

/**
 * Created by kevinstock on 3/11/17.
 */
public class Student {

    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int credits;
    private double qualityScore = 0.0;
    private double gpa;

    public Student(String name, int studentId, int credits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.credits = credits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this (name, studentId, 0, 0);
    }

    public Student(String name) {
        this (name, nextStudentId);
        nextStudentId++;
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

    public double getGpa() {
        return gpa;
    }

    public void addGrade(int courseCredits, double grade) {
        this.credits += courseCredits;
        qualityScore += (double)credits * grade;
        gpa = (double)Math.round((qualityScore / this.credits) * 1000) / 1000;
    }

    public String getGradeLevel() {
        // less than 30 credits is a freshman
        if (this.getCredits() < 30) {
            return FRESHMAN;
        }
        // 30 - 60 credits is a sophomore
        else if (this.getCredits() >= 30 && this.getCredits() < 60) {
            return SOPHOMORE;
        }
        // 60 - 90 credits is a junior
        else if (this.getCredits() >= 60 && this.getCredits() < 90) {
            return JUNIOR;
        }
        // 90 or more credits is a senior
        else if (this.getCredits() >= 90) {
            return SENIOR;
        }
        return "Error";
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;

        Student s = (Student) o;

        return Objects.equals(name, s.getName())
                && getStudentId() == s.getStudentId();
    }

    public String toString() {
        return "Student Name:\t" + name + "\n" +
                "Student ID:\t" + studentId + "\n" +
                "Credits:\t" + credits + "\n" +
                "Quality Score:\t" + qualityScore + "\n" +
                "GPA:\t" + gpa;
    }
}
