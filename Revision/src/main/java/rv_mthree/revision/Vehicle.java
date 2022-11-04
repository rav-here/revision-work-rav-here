/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv_mthree.revision;

/**
 *
 * @author rachelvickerman
 */
public class Vehicle {
    
    // variables
    private String colour;
    private int wheels;
    private String model;

    // constructor
    public Vehicle(String colour, int wheels, String model) {
        this.colour = colour;
        this.wheels = wheels;
        this.model = model;
    }

    // getters
    public String getColour() {
        return colour;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    // setters
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public void honk() {
        System.out.println("Toooooooooot");
    }
    
    public void drive() {
        System.out.println("bbrrrrmmm");
    }
    
    public void transport() {
        System.out.println("All vehicles transport things");
    }
    
}
