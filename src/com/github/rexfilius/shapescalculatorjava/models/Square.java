
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
        //Scanner input = new Scanner(System.in);
        square = new Square();
        while(true) {
            System.out.println("Type in the SideLength");
            try {
                double arg = input.nextDouble();
                square.setSideLength(arg);
                System.out.println("Area of Square is " + square.getArea());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }
    
    public void printPerimeter() {
        //Scanner input = new Scanner(System.in);
        square = new Square();
        while(true) {
            System.out.println("Type in the SideLength");
            try {
                double arg = input.nextDouble();
                square.setSideLength(arg);
                System.out.println("Perimeter of Square is " + square.getPerimeter());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }
    
}
