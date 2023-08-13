
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

public class Triangle extends Shape {

    @Override
    public double area() {
        return 0.5 * (getBaseLength() * getHeight());
    }

    @Override
    public double perimeter() {
        return getSideLength1() + getSideLength2() + getBaseLength();
    }

    @Override
    public void calculateArea(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Type in the BaseLength of the Triangle");
                double arg1 = scanner.nextDouble();
                this.setBaseLength(arg1);
                System.out.println("BaseLength: " + arg1);

                System.out.println("Type in the Height of the Triangle");
                double arg2 = scanner.nextDouble();
                this.setHeight(arg2);
                System.out.println("Height: " + arg2);

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
                System.out.println("Type in SideLength-1 of the Triangle");
                double arg1 = scanner.nextDouble();
                this.setSideLength1(arg1);
                System.out.println("SideLength-1: " + arg1);

                System.out.println("Type in SideLength-2 of the Triangle");
                double arg2 = scanner.nextDouble();
                this.setSideLength2(arg2);
                System.out.println("SideLength-2: " + arg2);

                System.out.println("Type in BaseLength of the Triangle");
                double arg3 = scanner.nextDouble();
                this.setBaseLength(arg3);
                System.out.println("BaseLength: " + arg3);

                System.out.printf("Perimeter of Triangle is %.3f", this.perimeter());
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

}
