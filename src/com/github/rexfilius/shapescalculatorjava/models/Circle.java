package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Circle extends Shape {

    // Circle circle;
    //Scanner input = new Scanner(System.in);

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

    }

    @Override
    public void calculatePerimeter() {

    }


    public void calculateArea(Scanner input) {
        //circle = new Circle();
        while (true) {
            try {
                getRadiusOfCircle(input);
                System.out.printf("Area of Circle is %.3f", this.area());
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

    public void calculatePerimeter(Scanner input) {
        // circle = new Circle();
        while (true) {
            try {
                getRadiusOfCircle(input);
                System.out.printf("Circumference of Circle is %.3f", this.perimeter());
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

    private void getRadiusOfCircle(Scanner input) {
        System.out.println("Type in the Radius of the Circle");
        double arg = input.nextDouble();
        this.setRadius(arg);
        System.out.println("Radius: " + arg);
    }

}