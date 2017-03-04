package org.launchcode.java.demos.java4python;

import java.util.Date;

/**
 * From "Java for Python Programmers"
 */
public class Hello {
    public static void main(String[] args) {

        String message = "Hello World";

        Date today = new Date();

        System.out.println(today + ": " + message);
    }
}
