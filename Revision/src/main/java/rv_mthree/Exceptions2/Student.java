/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv_mthree.Exceptions2;

/**
 *
 * @author rachelvickerman
 */
public class Student {
    
    // variables of class
    private int rollNo;
    private int age;
    private String name;
    private int marks;

    // constructor of class
    public Student(int rollNo, int age, String name, int marks) throws marksCheckedException, ageCheckedException {
        // if age is in bounds 
        if (age >= 4 && age <= 18) {
            this.age = age; // initialise varibale
        } // otherwise throw an exception for age
        else {
            throw new ageCheckedException("This age is out of bounds for a student!");
        }
        // if the marks are in bounds
        if (marks >= 0 && marks <= 100) {
            this.marks = marks; // initialise variable
        } // otherwise throw an exception for marks
        else {
            throw new marksCheckedException("This mark is not valid!");
        }
        // construct/initialise other variables 
        this.rollNo = rollNo;
        this.name = name;
        
    }
    // getters and setters
    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    // in setters for age and marks do the same check for the bounds 
    public void setAge(int age) throws ageCheckedException {
        
        if (age >= 4 && age <= 18) {
            this.age = age;
        }
        else {
            throw new ageCheckedException("This age is out of bounds for a student!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) throws marksCheckedException {
        
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
        else {
            throw new marksCheckedException("This mark is not valid!");
        }
    }
    
    public void display() {
        System.out.println("Student rollNo: "+rollNo + " Age: "+age + " Name: "+ name + " Marks: "+ marks);
    }
    
    
}
