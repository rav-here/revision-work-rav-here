/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv_mthree.revision;

/**
 *
 * @author rachelvickerman
 */
public class Height {
    
    private int feet;
    private int inches;

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
    
    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }
//// method that takes input from user/main class to initialise varibales in objects of the class
//    public void input(int feet, int inches) {
//        this.feet = feet;
//        this.inches = inches;
//    }
    
    public void sum(Height h1, Height h2) {
        int sumFeet = h1.getFeet() + h2.getFeet();
        int sumInches = h1.getInches() + h2.getInches();
        while (sumInches >= 12) {
            sumFeet += 1;
            sumInches -= 12;   
        }
        System.out.println("Height sum is " + sumFeet + " feet and " + sumInches + " inches");
            
    }
    
}
