
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

public class Trapezium extends Shape {

    Trapezium trapezium;
    Scanner input = new Scanner(System.in);

    private double getArea() {
        return (0.5 * (getTopLength() + getBaseLength())) * getHeight();
    }

    private double getPerimeter() {
        return getTopLength() + getBaseLength() + getSideLength1() + getSideLength2();
    }

    public void printArea() {
        trapezium = new Trapezium();
        while (true) {
            try {
                System.out.println("Type in the TopLength of the Trapezium");
                double arg1 = input.nextDouble();
                trapezium.setTopLength(arg1);
                System.out.println("TopLength: " + arg1);

                System.out.println("Type in the BaseLength of the Trapezium");
                double arg2 = input.nextDouble();
                trapezium.setBaseLength(arg2);
                System.out.println("BaseLength: " + arg2);

                System.out.println("Type in the height of the Trapezium");
                double arg3 = input.nextDouble();
                trapezium.setHeight(arg3);
                System.out.println("Height: " + arg3);

                System.out.println("Area of Trapezium is " + trapezium.getArea());
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

    public void printPerimeter() {
        trapezium = new Trapezium();
        while (true) {
            try {
                System.out.println("Type in the TopLength of the Trapezium");
                double arg1 = input.nextDouble();
                trapezium.setTopLength(arg1);
                System.out.println("TopLength: " + arg1);

                System.out.println("Type in the BaseLength of the Trapezium");
                double arg2 = input.nextDouble();
                trapezium.setBaseLength(arg2);
                System.out.println("BaseLength: " + arg2);

                System.out.println("Type in SideLength-1 of the Trapezium");
                double arg3 = input.nextDouble();
                trapezium.setSideLength1(arg3);
                System.out.println("SideLength-1: " + arg3);

                System.out.println("Type in SideLength-2 of the Trapezium");
                double arg4 = input.nextDouble();
                trapezium.setSideLength2(arg4);
                System.out.println("SideLength-2: " + arg4);

                System.out.println("Perimeter of Trapezium is " + trapezium.getPerimeter());
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

}
