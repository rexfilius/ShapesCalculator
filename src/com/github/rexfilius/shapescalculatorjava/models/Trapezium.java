
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

public class Trapezium extends Shape {

    @Override
    public double area() {
        return (0.5 * (getTopLength() + getBaseLength())) * getHeight();
    }

    @Override
    public double perimeter() {
        return getTopLength() + getBaseLength() + getSideLength1() + getSideLength2();
    }

    @Override
    public void calculateArea(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Type in the TopLength of the Trapezium");
                double arg1 = scanner.nextDouble();
                this.setTopLength(arg1);
                System.out.println("TopLength: " + arg1);

                System.out.println("Type in the BaseLength of the Trapezium");
                double arg2 = scanner.nextDouble();
                this.setBaseLength(arg2);
                System.out.println("BaseLength: " + arg2);

                System.out.println("Type in the height of the Trapezium");
                double arg3 = scanner.nextDouble();
                this.setHeight(arg3);
                System.out.println("Height: " + arg3);

                System.out.printf("Area of Trapezium is %.3f", this.area());
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
                System.out.println("Type in the TopLength of the Trapezium");
                double arg1 = scanner.nextDouble();
                this.setTopLength(arg1);
                System.out.println("TopLength: " + arg1);

                System.out.println("Type in the BaseLength of the Trapezium");
                double arg2 = scanner.nextDouble();
                this.setBaseLength(arg2);
                System.out.println("BaseLength: " + arg2);

                System.out.println("Type in SideLength-1 of the Trapezium");
                double arg3 = scanner.nextDouble();
                this.setSideLength1(arg3);
                System.out.println("SideLength-1: " + arg3);

                System.out.println("Type in SideLength-2 of the Trapezium");
                double arg4 = scanner.nextDouble();
                this.setSideLength2(arg4);
                System.out.println("SideLength-2: " + arg4);

                System.out.printf("Perimeter of Trapezium is %.3f", this.perimeter());
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

}
