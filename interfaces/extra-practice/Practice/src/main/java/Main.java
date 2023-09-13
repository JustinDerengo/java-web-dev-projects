package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    private String firstName;
    private String lastName;
    private int idNumber;

    public Employee(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        // Compare employees based on their last names
        return this.getLastName().compareTo(otherEmployee.getLastName());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + idNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Henry", "Mill", 103));
        employees.add(new Employee("Nal", "Brown", 9));
        employees.add(new Employee("Frank", "Hop", 865));
        employees.add(new Employee("Deborah", "King", 980));
        employees.add(new Employee("George", "Sky", 111));

        // Sort the employees by last name
        Collections.sort(employees);

        // Print the sorted employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

