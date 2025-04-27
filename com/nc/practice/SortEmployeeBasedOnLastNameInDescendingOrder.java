package com.nc.practice;

import java.util.Arrays;

/**
 * @author Shad Ahmad
 * Sort an Employee based on LastName in Descending Order
 */
public interface SortEmployeeBasedOnLastNameInDescendingOrder {
    static void main(String[] args) {
        Employee emp1=new Employee("Shad", "Ahmad", "Delhi", "Delhi", 50000, "India", 25);
        Employee emp2=new Employee("John", "Doe", "New York", "NY", 60000, "USA", 30);
        Employee emp3=new Employee("Alice", "Smith", "London", "England", 70000, "UK", 28);
        Employee emp4=new Employee("Bob", "Johnson", "Los Angeles", "CA", 55000, "USA", 35);
        Employee[] employees= {emp1, emp2, emp3, emp4};

        // Sort employees based on last name in descending order
        Arrays.sort(employees, (e1, e2) -> e2.getLastName().compareTo(e1.getLastName()));


        // Print sorted employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
