package com.nc.practice;



/**
 * @author Shad Ahmad
 * Sort an Employee based on FirstName in Ascending Order and salary in Descending Order
 */
public class Employee {

   private String firstName;
   private  String lastName;
   private String city;
    private String state;
     private double salary;
     private String country;
     private int age;

    public Employee(String firstName, String lastName, String city, String state, double salary, String country, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.salary = salary;
        this.country = country;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", salary=" + salary +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }
}

