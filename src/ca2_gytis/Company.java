/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_gytis;

import java.util.ArrayList;

/**
 *
 * @author Gytis
 */

// Part 2, A. Company class that stores information about employees
public class Company {
    
    private String companyName;
    private ArrayList<Employee> staff;
    
    // The default constructor for this class which initialises all fields
    public Company() {
        this.companyName = "Just a Company";
        this.staff = new ArrayList<>();
    }
    
    // An overloaded constructor which accepts a name value as a parameter (I assume that it should be a Company name)
    public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }
    
    // Method addNewStaff() adds a new employee to the staff arrayList (the employee is a parameter)
    public void addNewStaff(Employee employee){
        staff.add(employee);
    }
    
    // Accessor method getStaffNumber() returns the number of employees currently in the arrayList
    public int getStaffNumber(){
        return staff.size();
    }
    
    // Method listEmployees() uses an iterator object to find in the arrayList all employees above a given employee number value 
    // (this value is a parameter for this method) and prints the names of these employees
    public void listEmployees(int givenEmpNum){
        for (Employee emp : staff){
            if (emp.getEmpNum() > givenEmpNum){
                System.out.println("Employee with a employee number greater than " + givenEmpNum + " is: " + emp.getName());
            }
        }
    }
}
