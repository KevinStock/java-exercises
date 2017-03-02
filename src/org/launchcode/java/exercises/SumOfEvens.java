package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kevinstock on 3/1/17.
 */
public class SumOfEvens {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            int n = rand.nextInt(50) + 1;
            intList.add(n);
        }

        System.out.println(intList.toString());
        System.out.println(sum(intList));
    }

    public static int sum(ArrayList<Integer> intList) {
        int sum = 0;
        for (int i : intList) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
