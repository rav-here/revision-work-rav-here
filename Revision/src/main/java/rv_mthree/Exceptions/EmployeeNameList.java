/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv_mthree.Exceptions;

/**
 *
 * @author rachelvickerman
 */
public class EmployeeNameList {
    
    // varibales of class
    private EmployeeInput[] employees;
    private int totalNoOfEmployees; 
    
    // constructor of class
    public EmployeeNameList(int totalNoOfEmployees) {
        this.totalNoOfEmployees = totalNoOfEmployees;
        employees = new EmployeeInput[totalNoOfEmployees]; // makes array of employeeInput class objects
      
    }
    
    // method for inputting an employees info into the employee list- accepts employeeInput object and index integer
    public void inputEmployeeName(EmployeeInput emp, int index) throws NameCheckedException {
        if (employees[0] == null) { // if the first entry of the array is empty
            employees[0] = emp; // fill it
        } 
        else { // otherwise
            for (int j = 0; j < totalNoOfEmployees; j++) { // for all the members of the employee list array
                if ((employees[j].getName()).equals(emp.getName())) { // if the name of the employee being added equals an existing employees name
                    throw new NameCheckedException("Name is already in employee list."); // throw duplicate exception
                }
            }
        }
    }
    
    // method to display list of employees
    public void displayList() {
        for (int i = 0; i < totalNoOfEmployees; i++) {
            employees[i].display();
        }
            
    }
    
}
