package com.nc.practice;

import java.util.Arrays;
import java.util.List;

/**
 * @author Shad Ahmad
 *
 */
public class EmployeeSorter {

    public static void main(String[] args) {
        List<String> employees = Arrays.asList("John", "Alice", "Bob", "Charlie");

        // Sort the list of employees
        employees.sort(String::compareTo);

        // Print the sorted list
        System.out.println("Sorted Employees: " + employees);
    }


    }
