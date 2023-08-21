package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    System.out.println("Please enter the radius of the circle: ");
    Double radius = scnr.nextDouble();
    Double area = Circle.getArea(radius);

    System.out.println("The area of a circle of radius " + radius + "is: " + area);
    }
}
