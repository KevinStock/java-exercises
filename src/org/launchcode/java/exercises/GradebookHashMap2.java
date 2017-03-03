package org.launchcode.java.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by LaunchCode
 */
public class GradebookHashMap2 {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newStudentID;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            newStudentID = in.nextInt();

            if (!newStudentID.equals("")) {
                System.out.print("Student Name: ");
                String studentName = in.nextLine();
                students.put(newStudentID, studentName);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudentID.toString().equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }

}
