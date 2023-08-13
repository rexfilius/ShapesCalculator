
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

public class Square extends Shape {

    @Override
    public double area() {
        return getSideLength() * getSideLength();
    }

    @Override
    public double perimeter() {
        return 4 * getSideLength();
    }

    @Override
    public void calculateArea(Scanner scanner) {
        while (true) {
            try {
                getSideLengthOfSquare(scanner);
                System.out.printf("Area of Square is %.3f", this.area());
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

    @Override
    public void calculatePerimeter(Scanner scanner) {
        while (true) {
            try {
                getSideLengthOfSquare(scanner);
                System.out.printf("Perimeter of Square is %.3f", this.perimeter());
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

    private void getSideLengthOfSquare(Scanner scanner) {
        System.out.println("Type in the SideLength of the Square");
        double arg = scanner.nextDouble();
        this.setSideLength(arg);
        System.out.println("SideLength: " + arg);
    }

}
