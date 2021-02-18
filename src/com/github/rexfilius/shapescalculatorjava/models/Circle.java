
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Circle extends Shape {

    Circle circle;
    Scanner input = new Scanner(System.in);
    
    private double getArea() {
        return PI * getRadius() * getRadius();
    }
    
    private double getPerimeter() {
        return 2 * PI * getRadius();
    }
    
    public void printArea() {
        // Scanner input = new Scanner(System.in);
        circle = new Circle();
        while(true) {
            System.out.println("Type in the Radius");
            try {
                double arg = input.nextDouble();
                circle.setRadius(arg);
                System.out.println("Area of Circle is " + circle.getArea());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }
    
    public void printPerimeter() {
        // Scanner input = new Scanner(System.in);
        circle = new Circle();
        while(true) {
            System.out.println("Type in the Radius");
            try {
                double arg = input.nextDouble();
                circle.setRadius(arg);
                System.out.println("Circumference of Circle is " + circle.getPerimeter());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }
    
}