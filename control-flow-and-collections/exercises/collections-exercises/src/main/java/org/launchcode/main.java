package org.launchcode;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int [] integerArray = {1, 1, 2, 3, 5, 8};

        for (int i : integerArray) {
            if (integerArray[i] % 2 != 0) {
                System.out.println(integerArray[i]);
            }
        }

        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = seuss.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentence = seuss.split(".");
        System.out.println(Arrays.toString(sentence));
    }
}
