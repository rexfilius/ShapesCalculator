
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

public class Rectangle extends Shape {

    Rectangle rectangle;
    Scanner input = new Scanner(System.in);

    private double getArea() {
        return getLength() * getBreadth();
    }

    private double getPerimeter() {
        return 2 * (getLength() + getBreadth());
    }

    public void printArea() {
        rectangle = new Rectangle();
        while (true) {
            try {
//                System.out.println("Type in the Length of the Rectangle");
//                double arg1 = input.nextDouble();
//                rectangle.setLength(arg1);
//                System.out.println("Length: " + arg1);
//
//                System.out.println("Type in the Breadth of the Rectangle");
//                double arg2 = input.nextDouble();
//                rectangle.setBreadth(arg2);
//                System.out.println("Breadth: " + arg2);
                getLengthAndBreadth();
                System.out.println("Area of Triangle is " + rectangle.getArea());
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

    public void printPerimeter() {
        rectangle = new Rectangle();
        while (true) {
            try {
//                System.out.println("Type in the Length of the Rectangle");
//                double arg1 = input.nextDouble();
//                rectangle.setLength(arg1);
//                System.out.println("Length: " + arg1);
//
//                System.out.println("Type in the Breadth of the Rectangle");
//                double arg2 = input.nextDouble();
//                rectangle.setBreadth(arg2);
//                System.out.println("Breadth: " + arg2);
                getLengthAndBreadth();
                System.out.println("Perimeter of Rectangle is " + rectangle.getPerimeter());
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
