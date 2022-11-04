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
    
    private int Age;
    private String Name;
    
    public EmployeeInput(String Name, int Age) throws AgeCheckedException {
        if (Age >= 18 && Age <= 60) {
            this.Age = Age;
            this.Name = Name;
        }
        else {
            throw new AgeCheckedException("Age must be greater than 18 and less than 60.");
        }
        
    }
    
    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
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
    
    public void display() {
        System.out.println("Name of employee: "+ Name + " Age of employee: "+ Age);
        
    }
    
}
