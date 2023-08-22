package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int [] integerArray = {1, 1, 2, 3, 5, 8};

        for (int i : integerArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = seuss.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentence = seuss.split("\\.");
        System.out.println(Arrays.toString(sentence));

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,4,7,9,4,5,8,6,3));

        System.out.println(sumEven(arr));

    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
