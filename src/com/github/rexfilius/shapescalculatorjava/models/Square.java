
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

public class Square extends Shape {

    Square square;
    Scanner input = new Scanner(System.in);
    
    private double getArea() {
        return getSideLength() * getSideLength();
    }
    
    private double getPerimeter() {
        return 4 * getSideLength();
    }
    
    public void printArea() {
        square = new Square();
        while(true) {
            try {
//                System.out.println("Type in the SideLength of the Square");
//                double arg = input.nextDouble();
//                square.setSideLength(arg);
//                System.out.println("SideLength: " + arg);
                getSideLengthOfSquare();
                System.out.println("Area of Square is " + square.getArea());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }
    
    public void printPerimeter() {
        square = new Square();
        while(true) {
            try {
//                System.out.println("Type in the SideLength of the Square");
//                double arg = input.nextDouble();
//                square.setSideLength(arg);
//                System.out.println("SideLength: " + arg);
                getSideLengthOfSquare();
                System.out.println("Perimeter of Square is " + square.getPerimeter());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

    private void getSideLengthOfSquare() {
        System.out.println("Type in the SideLength of the Square");
        double arg = input.nextDouble();
        square.setSideLength(arg);
        System.out.println("SideLength: " + arg);
    }
    
}
