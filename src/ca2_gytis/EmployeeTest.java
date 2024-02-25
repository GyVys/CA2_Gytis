/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_gytis;

/**
 *
 * @author Gytis
 */

// Part 1, B. Create EmployeeTest class containing main method
public class EmployeeTest {
    
    public static void main(String[] args) {
        
        // Create 3 Employee objects
        Employee emp1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee emp2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee emp3 = new Employee("Tom Thumb", "tt@gmail.com");
        
        // Declare an array and load those 3 objects into it
        Employee[] projectGroup = new Employee[3];
        
        projectGroup[0] = emp1;
        projectGroup[1] = emp2;
        projectGroup[2] = emp3;
        
        // Print the value of variable nextEmpNum
        System.out.println("The value of nextEmpNum is: " + Employee.getNextEmpNum());
        
        // C. Search and display the name of each of the employees in the projectGroup array, 
        //    who have an employee number above the value stored in a variable called m.
        int m = 2;
        System.out.println("Employees with employee number above " + m + ":");
        for (Employee emp : projectGroup) {
            if (emp.getEmpNum() > m) {
                System.out.println(emp.getName());
            }
        }
        
        
//        // Everything below is just for testing
//        
//        Employee empTest = new Employee();
//        Employee empTest2 = new Employee("Karl", "kone@123.ie");
//        
//        // Displaying employee information
//        System.out.println("Employee default: " + empTest.getName() + ", Email: " + empTest.getEmail() + ", Employee Number: " + empTest.getEmpNum());
//        System.out.println("Employee Karl: " + empTest2.getName() + ", Email: " + empTest2.getEmail() + ", Employee Number: " + empTest2.getEmpNum());
//        
//        // Testing setEmail method
//        // Should set email
//        empTest.setEmail("username@domain.com");
//        System.out.println("Employee pass New Email: " + empTest.getEmail());
//        empTest.setEmail("user.name@domain.com");
//        System.out.println("Employee pass New Email: " + empTest.getEmail());
//        empTest.setEmail("user-name@domain.com");
//        System.out.println("Employee pass New Email: " + empTest.getEmail());
//        empTest.setEmail("username@domain.co.in");
//        System.out.println("Employee pass New Email: " + empTest.getEmail());
//        empTest.setEmail("user_name@domain.com");
//        System.out.println("Employee pass New Email: " + empTest.getEmail());
//        
//        // Should not set email
//        empTest2.setEmail("ab");
//        System.out.println("Employee fail New Email: " + empTest2.getEmail());
//        empTest2.setEmail("username.@domain.com");
//        System.out.println("Employee fail New Email: " + empTest2.getEmail());
//        empTest2.setEmail(".user.name@domain.com");
//        System.out.println("Employee fail New Email: " + empTest2.getEmail());
//        empTest2.setEmail("user-name@domain.com.");
//        System.out.println("Employee fail New Email: " + empTest2.getEmail());
//        empTest2.setEmail("username@.com");
//        System.out.println("Employee fail New Email: " + empTest2.getEmail());
//
//        // Testing getNextEmpNum method
//        System.out.println("Next Employee Number: " + Employee.getNextEmpNum());
    }
    
}
