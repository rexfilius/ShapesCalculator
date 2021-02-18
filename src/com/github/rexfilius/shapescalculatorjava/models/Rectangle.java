
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

public class Rectangle extends Shape {
    
    private double getArea() {
        return getLength() * getBreadth();
    }
    
    private double getPerimeter() {
        return 2 * (getLength() + getBreadth());
    }
    
    public void printArea() {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        while(true) {
            System.out.println("Type in the Length & Breadth");
            try {
                double arg1 = input.nextDouble();
                rectangle.setLength(arg1);
                double arg2 = input.nextDouble();
                rectangle.setBreadth(arg2);
                System.out.println("Area of Triangle is " + rectangle.getArea());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }
     
    public void printPerimeter() {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        while(true) {
            System.out.println("Type in the Length & Breadth");
            try {
                double arg1 = input.nextDouble();
                rectangle.setLength(arg1);
                double arg2 = input.nextDouble();
                rectangle.setBreadth(arg2);
                System.out.println("Perimeter of Rectangle is " + rectangle.getPerimeter());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }
    
}
