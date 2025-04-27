package com.nc.practice;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Shad Ahmad
 * Sort an Employee based on FirstName in Ascending Order
 */
public class SortEmployeeBasedOnFirstNameInAscendingOrder{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Shad", "Ahmad", "Delhi", "Delhi", 50000, "India", 25);
        Employee emp2 = new Employee("John", "Doe", "New York", "NY", 60000, "USA", 30);
        Employee emp3 = new Employee("Alice", "Smith", "London", "England", 70000, "UK", 28);

        Employee[] employees = {emp1, emp2, emp3};

        // Sort employees based on first name in ascending order
        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));

        // Print sorted employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
