/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv_mthree.Exceptions;

import java.util.Scanner;


// employee class - accepts name and age of employee - must check age is between 18 and 60 + add exppetion
// employee list - makes array of employees with their name and age - must check name is not repeated! + add exception
// exception classes - checked for both (can do unchecked too)
// main class creates the array



/**
 *
 * @author rachelvickerman
 */
public class EmployeeMain {
    
    
    public static void main(String[] args) {
        // instantiate scanner
        Scanner scan = new Scanner(System.in);
        // prompt for number of employees
        System.out.println("Please enter number of employees : ");
        // accept integer user input
        int total = scan.nextInt();
        // instantiate list array object with length total 
        EmployeeNameList NameList = new EmployeeNameList(total);
        // declare reference variable for employeeInput object
        EmployeeInput emp;
        
        // try catch block for exceptions
        try {
            for (int i = 0; i < total; i++) { // for all members of the employee NameList
                // print prompt for age
                System.out.println("Please enter employee age: ");
                int age = scan.nextInt(); // accept input
                // pint prompt for name
                System.out.println("Please enter employee name: ");
                String name = scan.next(); // accept it
                // initiliase employeeInput object
                emp = new EmployeeInput(name, age);
                // add it the NameList array
                NameList.inputEmployeeName(emp, i);
            }
        }  // specify exceptions to be caught and dealt wih
        catch (AgeCheckedException a) { 
            System.out.println("Employee age is not eligible for employment - out of bounds age entered");
        }
        catch(NameCheckedException a) {
            System.out.println("Employee name is not eligible for employment- duplicate name entered");
        }
        
        //NameList.displayList();       
    }
    
}
