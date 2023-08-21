package org.launchcode;
import java.util.Scanner;
public class Miles {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double numMiles = scnr.nextDouble();

        System.out.println("How much gas did you use? In gallons:");
        Double numGallons = scnr.nextDouble();

        Double mpg = numMiles / numGallons;
        System.out.println("You are running on " + mpg + "mpg.");
    }
}
