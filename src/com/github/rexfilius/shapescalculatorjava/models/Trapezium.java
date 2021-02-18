
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

public class Trapezium extends Shape {
    
    private double getArea() {
        return (0.5 *(getTopLength() + getBaseLength())) *getHeight();
    }
    
    private double getPerimeter() {
        return getTopLength() + getBaseLength() + getSideLength1() + getSideLength2();
    }
    
    public void printArea() {
        Scanner input = new Scanner(System.in);
        Trapezium trapezium = new Trapezium();
        while(true) {
            System.out.println("Type in the TopLength, Baselength & Height");
            try {
                double arg1 = input.nextDouble();
                trapezium.setTopLength(arg1);
                double arg2 = input.nextDouble();
                trapezium.setBaseLength(arg2);
                double arg3 = input.nextDouble();
                trapezium.setHeight(arg3);
                System.out.println("Area of Trapezium is " + trapezium.getArea());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }   
    
    public void printPerimeter() {
        Scanner input = new Scanner(System.in);
        Trapezium trapezium = new Trapezium();
        while(true) {
            System.out.println("Type in the TopLength, Baselength, SideLength1 & SideLength2");
            try {
                double arg1 = input.nextDouble();
                trapezium.setTopLength(arg1);
                double arg2 = input.nextDouble();
                trapezium.setBaseLength(arg2);
                double arg3 = input.nextDouble();
                trapezium.setSideLength1(arg3);
                double arg4 = input.nextDouble();
                trapezium.setSideLength2(arg4);
                System.out.println("Perimeter of Trapezium is " + trapezium.getPerimeter());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }
    
}
