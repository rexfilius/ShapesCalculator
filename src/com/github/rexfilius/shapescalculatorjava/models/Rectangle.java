
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

public class Rectangle extends Shape {

    @Override
    public double area() {
        return getLength() * getBreadth();
    }

    @Override
    public double perimeter() {
        return 2 * (getLength() + getBreadth());
    }

    @Override
    public void calculateArea(Scanner scanner) {
        while (true) {
            try {
                getLengthAndBreadth(scanner);
                System.out.printf("Area of Triangle is %.3f", this.area());
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
                getLengthAndBreadth(scanner);
                System.out.printf("Perimeter of Rectangle is %.3f", this.perimeter());
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

    private void getLengthAndBreadth(Scanner scanner) {
        System.out.println("Type in the Length of the Rectangle");
        double arg1 = scanner.nextDouble();
        this.setLength(arg1);
        System.out.println("Length: " + arg1);

        System.out.println("Type in the Breadth of the Rectangle");
        double arg2 = scanner.nextDouble();
        this.setBreadth(arg2);
        System.out.println("Breadth: " + arg2);
    }

}
