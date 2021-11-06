
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Circle extends Shape {

    Circle circle;
    Scanner input = new Scanner(System.in);

    @Override
    public double area() {
        return PI * getRadius() * getRadius();
    }

    @Override
    public double perimeter() {
        return 2 * PI * getRadius();
    }

    @Override
    public void calculateArea() {
        circle = new Circle();
        while (true) {
            try {
                getRadiusOfCircle();
                System.out.println("Area of Circle is " + circle.area());
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

    @Override
    public void calculatePerimeter() {
        circle = new Circle();
        while (true) {
            try {
                getRadiusOfCircle();
                System.out.println("Circumference of Circle is " + circle.perimeter());
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

    private void getRadiusOfCircle() {
        System.out.println("Type in the Radius of the Circle");
        double arg = input.nextDouble();
        circle.setRadius(arg);
        System.out.println("Radius: " + arg);
    }

}