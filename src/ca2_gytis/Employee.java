/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_gytis;

import java.util.regex.Pattern;

/**
 *
 * @author Gytis
 */

// Part 1, A. Write the complete class, Employee
public class Employee {
    
    private String name;
    private String email;
    private String username;
    private String password;
    private int empNum;
    
    /* Static field nextEmpNum of type int and initialized to 1, 
    which initialises empNum in the constructor.
    Its value then is incremented to give consecutive numbers to each newly created object*/
    private static int nextEmpNum = 1;

    // Constructor with default values
    public Employee() {
        this.name = "John Doe";
        this.email = "jdoe@123.ie";
        this.empNum = nextEmpNum;
        nextEmpNum++;
    }

    // Constructor with parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum;
        nextEmpNum++;
    }
    
    /* Part 2, B. A particular employee has been designated a “manager”. 
    They are considered as a regular employee for all purposes, 
    except that they also have a “username” and a “password” as fields, with corresponding getters and setters. */
    public Employee(String name, String email, String username, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.empNum = nextEmpNum;
        nextEmpNum++;
    }    

    // Accessor method for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Accessor method for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
    
    // Accessor method for name
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // Accessor method for email
    public String getEmail(){
        return email;
    }
    
    // Accessor method for empNum
    public int getEmpNum(){
        return empNum;
    }
    
    // Method for setting email field to a new value passed as a parameter
    public void setEmail(String email){
        
        // Check if email is longer than 3 characters
        if (!(email.length() > 3)){
            System.out.println("Error: email address must be longer than 3 characters!");
        }
                
        else if (!(emailValidation(email))){
            System.out.println("Error: enter a valid email address!");
        }
        else {
            this.email = email;
        }
    }
    
    public static boolean emailValidation(String email){
        
        // Challenge accepted:
        // Checking a strict validation of email address with regex
        String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
       
        return Pattern.matches(regex, email);
    }
    
    // Method to return the current value of nextEmpNum
    public static int getNextEmpNum(){
        return nextEmpNum;
    }
    
}