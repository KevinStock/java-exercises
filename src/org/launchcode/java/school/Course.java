package org.launchcode.java.school;

import java.util.ArrayList;

/**
 * Created by kevinstock on 3/11/17.
 */
public class Course {

    private String courseName;
    private final int courseCredit;
    private ArrayList<Student> roster;

    public Course(String courseName, int courseCredit) {
        this.courseName = courseName;
        this.courseCredit = courseCredit;
        this.roster = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

}

