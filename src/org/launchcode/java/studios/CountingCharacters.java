package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by kevinstock on 2/23/17.
 */
public class CountingCharacters {

    public static void main(String[] args) {

        HashMap characters = new HashMap();

//        String testText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula " +
//                "scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. " +
//                "Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, " +
//                "volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide a string: ");
        String testText = in.nextLine();

        char[] charactersInString = testText.toCharArray();

        for (int i = 0; i < charactersInString.length; i++) {
            if (characters.containsKey(charactersInString[i])) {
                characters.put(charactersInString[i], (int)characters.get(charactersInString[i]) + 1);
            }
            else {
                characters.put(charactersInString[i], 1);
            }
        }
        System.out.println(characters.toString());
    }
}
