package org.launchcode;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("How long is your rectangle: ");
        int length = scnr.nextInt();

        System.out.println("What is the width of your rectangle: ");
        int width = scnr.nextInt();

        System.out.println("The area of your rectangle is " + length * width);

    }
}
