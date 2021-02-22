
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

public class Parallelogram extends Shape {

    Parallelogram parallelogram;
    Scanner input = new Scanner(System.in);

    private double getArea() {
        return getBaseLength() * getHeight();
    }
    
    private double getPerimeter() {
        return 2 * (getBaseLength() + getSideLength());
    }
    
    public void printArea() {
        //Scanner input = new Scanner(System.in);
        parallelogram = new Parallelogram();
        while(true) {
            System.out.println("Type in the BaseLength & Height");
            try {
                double arg1 = input.nextDouble();
                parallelogram.setBaseLength(arg1);
                double arg2 = input.nextDouble();
                parallelogram.setHeight(arg2);
                System.out.println("Area of Parallelogram is " + parallelogram.getArea());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }
    
    public void printPerimeter() {
        //Scanner input = new Scanner(System.in);
        parallelogram = new Parallelogram();
        while(true) {
            System.out.println("Type in the BaseLength & SideLength");
            try {
                double arg1 = input.nextDouble();
                parallelogram.setBaseLength(arg1);
                double arg2 = input.nextDouble();
                parallelogram.setSideLength(arg2);
                System.out.println("Perimeter of Parallelogram is " + parallelogram.getPerimeter());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }
    
}
