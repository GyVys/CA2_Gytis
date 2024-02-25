/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2_gytis;

/**
 *
 * @author Gytis
 */
public class CA2_Gytis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee empTest = new Employee();
        Employee empTest2 = new Employee("Karl", "kone@123.ie");
        
        // Displaying employee information
        System.out.println("Employee 1: " + empTest.getName() + ", Email: " + empTest.getEmail() + ", Employee Number: " + empTest.getEmpNum());
        System.out.println("Employee 2: " + empTest2.getName() + ", Email: " + empTest2.getEmail() + ", Employee Number: " + empTest2.getEmpNum());
        
        // Testing setEmail method
        // Should set email
        empTest.setEmail("newemail@example.com");
        empTest.setEmail("username@domain.com");
        empTest.setEmail("user.name@domain.com");
        empTest.setEmail("user-name@domain.com");
        empTest.setEmail("username@domain.co.in");
        empTest.setEmail("user_name@domain.com");
        
        // should not set email
        empTest2.setEmail("ab");
        empTest2.setEmail("username.@domain.com");
        empTest2.setEmail(".user.name@domain.com");
        empTest2.setEmail("user-name@domain.com.");
        empTest2.setEmail("username@.com");

        System.out.println("Employee 1 New Email: " + empTest.getEmail());
        
        // Testing getNextEmpNum method
        System.out.println("Next Employee Number: " + Employee.getNextEmpNum());
        
        
    }
    
}
