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
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter number of employees : ");
        int total = scan.nextInt();
        
        EmployeeNameList NameList = new EmployeeNameList(total);
        EmployeeInput emp;
        
        try {
            for (int i = 0; i < total; i++) {

                System.out.println("Please enter employee age: ");
                int age = scan.nextInt();

                System.out.println("Please enter employee name: ");
                String name = scan.next();

                emp = new EmployeeInput(name, age);
                NameList.inputEmployeeName(emp, i);
            }
        }  
        catch (AgeCheckedException a) {
            System.out.println("Employee age is not eligible for employment - out of bounds age entered");
        }
        catch(NameCheckedException a) {
            System.out.println("Employee name is not eligible for employment- duplicate name entered");
        }
        
        //NameList.displayList();       
    }
    
}
