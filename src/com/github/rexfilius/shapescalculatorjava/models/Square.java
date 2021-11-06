
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

public class Square extends Shape {

    Square square;
    Scanner input = new Scanner(System.in);

    @Override
    public double area() {
        return getSideLength() * getSideLength();
    }

    @Override
    public double perimeter() {
        return 4 * getSideLength();
    }

    @Override
    public void calculateArea() {
        square = new Square();
        while (true) {
            try {
                getSideLengthOfSquare();
                System.out.println("Area of Square is " + square.area());
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

    @Override
    public void calculatePerimeter() {
        square = new Square();
        while (true) {
            try {
                getSideLengthOfSquare();
                System.out.println("Perimeter of Square is " + square.perimeter());
                break;
            } catch (Exception e) {
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
