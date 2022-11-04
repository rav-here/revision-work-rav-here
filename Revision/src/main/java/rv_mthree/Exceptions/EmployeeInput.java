/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv_mthree.Exceptions;

/**
 *
 * @author rachelvickerman
 */
public class EmployeeInput {
    
    // variables of class
    private int Age;
    private String Name;
    
    // constructor of class
    public EmployeeInput(String Name, int Age) throws AgeCheckedException { // throws age exception
        if (Age >= 18 && Age <= 60) { // if age is between 18 and 60
            this.Age = Age; // dont throw
            this.Name = Name;
        }
        else { // otherwise throw the exception
            throw new AgeCheckedException("Age must be greater than 18 and less than 60.");
        }
        
    }
    // getters and setters 
    public int getAge() {
        return Age;
    }

    public void setAge(int Age) { // add throw to age exception here too
        if (Age >= 18 && Age <= 60) {
            this.Age = Age;
        }
        else {
            throw new AgeUncheckedException("Age should be not be less than 18 or greater than 60");
        }
        
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    // display method - dispays 1 employee's info
    public void display() {
        System.out.println("Name of employee: "+ Name + " Age of employee: "+ Age);
        
    }
    
}
