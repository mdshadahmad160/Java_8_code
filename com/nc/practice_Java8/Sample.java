package com.nc.practice_Java8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        /**
         * Calculate the age of person in years
         * Write a java 8 program is to calculate the age of a person in a years given their birthday
         */
        calculatePersonAgeInYear();
        lastElementInArray();
        firstTenOddNumbers();

    }
    public static void calculatePersonAgeInYear(){
        LocalDate birthDate=LocalDate.of(1998,8,17);
        LocalDate currentDate=LocalDate.now();
        int age= Period.between(birthDate,currentDate).getYears();
        System.out.println("Age of Person is: " + age);
    }
    /**
     * Get the last element of an array
     */
    public static void  lastElementInArray() {
        int[] intArray = {0, 1, 2, 3, 4, 5};
        Integer lastElementInArray = Arrays.stream(intArray)
                .boxed()
                .reduce((first, second) -> second)
                .orElse(-1);
        System.out.println("Last Element In An Array is: " + lastElementInArray);


    }
    /**
     * Print the 1st 10 Odd Number using java 8
     */
    public static void firstTenOddNumbers(){
        Stream.iterate(1, i->i+2)
                .limit(10)
                .forEach(System.out::println);

    }
}