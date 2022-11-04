/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv_mthree.Exceptions2;

import java.util.Scanner;

/**
 *
 * @author rachelvickerman
 */
public class StudentMain {
    
    public static void main(String[] args) {
        // instantiate scanner
        Scanner scan = new Scanner(System.in);
        // prompt for number of students
        System.out.println("Please enter number of students : ");
        // accept integer user input
        int total = scan.nextInt();
        // instantiate list array object with length total 
        StudentList studentList = new StudentList(total);
        // declare reference variable for student object
        Student student;
        
        // try catch block for exceptions
        try {
            for (int i = 0; i < total; i++) { // for all members of the studentList
                // print prompt for rollNo
                System.out.println("Please enter student roll no: ");
                int rollNo = scan.nextInt(); // accept input
                // print prompt for age
                System.out.println("Please enter student age: ");
                int age = scan.nextInt(); // accept input
                // print prompt for name
                System.out.println("Please enter student name: ");
                String name = scan.next(); // accept it
                // print prompt for marks
                System.out.println("Please enter student marks: ");
                int marks = scan.nextInt(); // accept input
                // initiliase student object
                student = new Student(rollNo, age, name, marks);
                // add it the studentList array
                studentList.inputStudent(student, i);
            }
        }  // specify exceptions to be caught and dealt wih
        catch(rollNoCheckedException r) {
            System.out.println("Student roll no is not eligible- duplicate roll no entered");
        }
        catch (ageCheckedException a) { 
            System.out.println("Student age is not eligible - out of bounds age entered");
        }
        catch(marksCheckedException m) {
            System.out.println("Student mark is not eligible- out of bounds mark entered");
        }
        
        //NameList.displayList();       
    }
    
}
