package org.launchcode.java.school;

import java.util.ArrayList;
import java.util.Objects;

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

    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;

        // null check
        if (o == null)
            return false;

        // type check and cast
        if (getClass() != o.getClass())
            return false;

        Course course = (Course) o;

        // field comparison
        return Objects.equals(courseName, course.getCourseName())
                && getCourseCredit() == course.getCourseCredit();
    }

    public String toString() {
        return "Course Name: " + courseName + "\n" +
                "Credits: " + courseCredit + "\n" +
                "Roster: " + roster.toString();
    }

}

