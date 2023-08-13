
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

public class Parallelogram extends Shape {

    Parallelogram parallelogram;
    Scanner input = new Scanner(System.in);

    @Override
    public double area() {
        return getBaseLength() * getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * (getBaseLength() + getSideLength());
    }

    @Override
    public void calculateArea() {
        parallelogram = new Parallelogram();
        while (true) {
            try {
                System.out.println("Type in the BaseLength of the Parallelogram");
                double arg1 = input.nextDouble();
                parallelogram.setBaseLength(arg1);
                System.out.println("BaseLength: " + arg1);

                System.out.println("Type in the Height of the Parallelogram");
                double arg2 = input.nextDouble();
                parallelogram.setHeight(arg2);
                System.out.println("Height: " + arg2);

                System.out.printf("Area of Parallelogram is %.3f", parallelogram.area());
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

    @Override
    public void calculatePerimeter() {
        parallelogram = new Parallelogram();
        while (true) {
            try {
                System.out.println("Type in the BaseLength of the Parallelogram");
                double arg1 = input.nextDouble();
                parallelogram.setBaseLength(arg1);
                System.out.println("BaseLength: " + arg1);

                System.out.println("Type in the SideLength of the Parallelogram");
                double arg2 = input.nextDouble();
                parallelogram.setSideLength(arg2);
                System.out.println("SideLength: " + arg2);

                System.out.printf("Perimeter of Parallelogram is %.3f", parallelogram.perimeter());
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }

}
