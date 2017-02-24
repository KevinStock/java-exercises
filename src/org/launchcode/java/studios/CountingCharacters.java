package org.launchcode.java.studios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by kevinstock on 2/23/17.
 */
public class CountingCharacters {

    public static void main(String[] args) {

        HashMap<Character, Integer> characters = new HashMap<Character, Integer>();

//        String testText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula " +
//                "scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. " +
//                "Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, " +
//                "volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please provide a string: ");
//        String testText = in.nextLine();
//        testText = testText.replaceAll("[^a-zA-Z]+","");

        String fileName = "text.txt";
        String line = null;
        String testText = null;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                testText += line;
            }
            bufferedReader.close();
        } catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
        System.out.println(testText);

        char[] charactersInString = testText.toCharArray();

        for (int i = 0; i < charactersInString.length; i++) {
            char currentChar = Character.toUpperCase(charactersInString[i]);
            if (characters.containsKey(currentChar)) {
                characters.put(currentChar, (int)characters.get(currentChar) + 1);
            }
            else {
                characters.put(currentChar, 1);
            }
        }
        for (Character key : characters.keySet()) {
            System.out.println(key + ": " + characters.get(key));
        }

    }
}
