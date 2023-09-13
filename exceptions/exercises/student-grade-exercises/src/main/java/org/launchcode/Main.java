package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> entry : studentFiles.entrySet()) {
            try {
                int points = CheckFileExtension(entry.getValue());
                System.out.println(entry.getKey() + " received " + points + " points.");
            } catch (InvalidFileNameException e) {
                System.out.println(entry.getKey() + " error: " + e.getMessage());
            }
        }
    }

    public static int Divide(int x, int y)
    {
        if (y == 0) {
            try {
                throw new ArithmaticException("Cannot divide by zero!");
            } catch (ArithmaticException e) {
                e.printStackTrace();
            }
        }
        return x / y;
    }


    public static int CheckFileExtension(String fileName) throws InvalidFileNameException
    {
        // Write code here!
        int scoring;
        if (fileName == null || fileName.isEmpty()) {
            try {
                throw new InvalidFileNameException("Invalid file type!");
            } catch (InvalidFileNameException e) {
                scoring = -1;
                return scoring;
            }
        }
        if (fileName.endsWith(".java")) {
            scoring = 1;
        }
        else {
            scoring = 2;
        }
        return scoring;
    }

}