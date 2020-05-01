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

public class Square implements Shape{
    
   private double area, perimeter, length, width;
   String colour;
    
    public Square(){
        this.length = 1;
        this.width = 1;
        this.area = 1;
        this.perimeter = 4;
    }
    
    public Square(int length, int width){
        this.length = length;
        this.width = width;
        this.area = calculateArea(length, width);
        this.perimeter = calculatePerimeter(length,width);
        
    }
    
    @Override
    public double getArea(){
        return this.area;
    }
    
    @Override
    public double getPerimeter(){
        return this.perimeter;
    }
    
    public void setLength(int l){
        this.length = l;
        area = calculateArea(this.length, this.width);
        perimeter = calculatePerimeter(this.length, this.width);
    }
    
    public void setWidth(int w){
        this.width = w;
        area = calculateArea(this.length, this.width);
        perimeter = calculatePerimeter(this.length, this.width);
    }
    
    public void setColour(String colour){
        this.colour = colour;
    }
    
    private double calculateArea(double length, double width){
        return length*width;
    }
    
    private double calculatePerimeter(double length, double width){
        return 2*length + 2*width;
    }
    
    
}
