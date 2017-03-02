package org.launchcode.java.exercises;

import java.util.ArrayList;

/**
 * Created by kevinstock on 3/1/17.
 */
public class FiveLetterWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
