/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.gabrieltowey.shapes;

/**
 *
 * @author gabrieltowey
 */
public class Circle implements Shape {
    
    final static Double PI = 3.14159;
            
    double area, perimeter, diameter;
    String colour;
    
    public Circle(){
        this.diameter = 1.0;
        this.area = calculateArea(0.5,PI);
        this.perimeter = calculatePerimeter(1.0, PI);
        
    }
    
    public Circle(double diameter){
        this.diameter = diameter;
        this.area = calculateArea(diameter/2,PI);
        this.perimeter = calculatePerimeter(diameter, PI);
    }
    
    @Override
    public double getArea(){
        return this.area;
    }
    
    @Override
    public double getPerimeter(){
        return this.perimeter;
    }
    
    public void setColour(String colour){
        this.colour = colour;
    }
    
    public void setDiameter(double diameter){
        this.diameter = diameter;
        this.area = calculateArea(diameter/2.0, PI);
        this.perimeter = calculatePerimeter(diameter, PI);
        
    }
    
    private double calculateArea(double radius, double pi){
        return pi*radius*radius;
    }
    
    private double calculatePerimeter(double diameter, double pi){
        return pi*diameter;
    }
    
    
    
}
