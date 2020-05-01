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
public class Triangle implements Shape {
    
    double area, perimeter, aSide, bSide, base, height;
    String colour;
    
    public Triangle(){
        this.aSide = 1.0;
        this.bSide = 1.0;
        this.base = 1.0;
        this.height = 0.866;
        this.area = calculateArea(1.0,1.0);
        colour = null;
    }
    
    public Triangle(double a, double b, double base, double height){
        this.aSide = a;
        this.bSide = b;
        this.perimeter = calculatePerimeter(a,b,base);
        this.area = calculateArea(base,height);
        this.colour = null;
    }
    
    @Override
    public double getArea(){
     return this.area;
    }
    
    @Override
    public double getPerimeter(){
        return this.perimeter;
    }
    
    public String getColour(){
        return this.colour;
    }
    
    public void setSides(double a, double b, double base){
        this.aSide = a;
        this.bSide = b;
        this.base = base;
    }
    
    public void setColour(String colour){
        this.colour = colour;
    }
    
    private double calculatePerimeter(double a, double b, double c){
        return a + b + c;
    }
    
     private double calculateArea(double base, double height){
        return base * height;
    }
}
