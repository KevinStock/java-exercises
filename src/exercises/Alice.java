package exercises;

import java.util.Scanner;

/**
 * Created by kevinstock on 11/2/17.
 * The first sentence of Alice's Adventures in Wonderland is below.
 * Store this sentence in a string, and then prompt the user for a term to search for within this string.
 * Print whether or not the search term was found.
 * See if you can make the search case-insensitive, so that searching for "alice", for example, prints true.
 *
 * Alice was beginning to get very tired of sitting by her sister on the bank,
 * and of having nothing to do: once or twice she had peeped into the book her sister was reading,
 * but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice
 * 'without pictures or conversation?'
 */
public class Alice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter search word: ");
        String searchTerm = reader.next();
        reader.close();
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        if (alice.toLowerCase().contains(searchTerm.toLowerCase())) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}