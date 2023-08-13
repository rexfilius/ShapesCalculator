
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

public class Rectangle extends Shape {

    Rectangle rectangle;
    Scanner input = new Scanner(System.in);

    @Override
    public double area() {
        return getLength() * getBreadth();
    }

    @Override
    public double perimeter() {
        return 2 * (getLength() + getBreadth());
    }

    @Override
    public void calculateArea() {
        rectangle = new Rectangle();
        while (true) {
            try {
                getLengthAndBreadth();
                System.out.printf("Area of Triangle is %.3f", rectangle.area());
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

    @Override
    public void calculatePerimeter() {
        rectangle = new Rectangle();
        while (true) {
            try {
                getLengthAndBreadth();
                System.out.printf("Perimeter of Rectangle is %.3f", rectangle.perimeter());
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

    private void getLengthAndBreadth() {
        System.out.println("Type in the Length of the Rectangle");
        double arg1 = input.nextDouble();
        rectangle.setLength(arg1);
        System.out.println("Length: " + arg1);

        System.out.println("Type in the Breadth of the Rectangle");
        double arg2 = input.nextDouble();
        rectangle.setBreadth(arg2);
        System.out.println("Breadth: " + arg2);
    }

}
