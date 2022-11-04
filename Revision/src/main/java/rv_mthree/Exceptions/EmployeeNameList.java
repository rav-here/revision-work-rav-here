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
    
    private EmployeeInput[] employees;
    private int totalNoOfEmployees; 
    
    public EmployeeNameList(int totalNoOfEmployees) {
        this.totalNoOfEmployees = totalNoOfEmployees;
        employees = new EmployeeInput[totalNoOfEmployees];
      
    }
    
    public void inputEmployeeName(EmployeeInput emp, int index) throws NameCheckedException {
        if (employees[0] == null) {
            employees[0] = emp;
        }
        else {
            for (int j = 0; j < totalNoOfEmployees; j++) {
                if ((employees[j].getName()).equals(emp.getName())) {
                    throw new NameCheckedException("Name is already in employee list.");
                }
            }
        }
    }
    
    public void displayList() {
        for (int i = 0; i < totalNoOfEmployees; i++) {
            employees[i].display();
        }
            
    }
    
}
