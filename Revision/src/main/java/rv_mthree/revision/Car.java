/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv_mthree.revision;

/**
 *
 * @author rachelvickerman
 */
public class Car extends Vehicle {
    
    private String driveType; 
    
    public Car(String colour, int wheels, String model, String driveType) {
        super(colour, wheels, model);
        this.driveType = driveType;
        
    }
    
    public void openboot() {
        System.out.println("boots open!");
    }
    
    public void automobile() {
        System.out.println("I am an automobile!");
    }
    
    public void howToDrive() {
        System.out.println("This car is a " + driveType);
    }
    

    
}
