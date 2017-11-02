package exercises;

import java.util.Scanner;

/**
 * Created by kevinstock on 11/2/17.
 */
public class Alice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your name: ");
        String name = reader.next();
        reader.close();
        System.out.println("Hello, " + name);
    }
}
