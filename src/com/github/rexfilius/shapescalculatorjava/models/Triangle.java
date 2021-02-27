
package com.github.rexfilius.shapescalculatorjava.models;

import com.github.rexfilius.shapescalculatorjava.screen.Screen;

import java.util.Scanner;

public class Triangle extends Shape {

    Triangle triangle;
    Scanner input = new Scanner(System.in);
    
    private double getArea() {
        return getBaseLength() * getHeight();
    }
    
    private double getPerimeter() {
        return getSideLength1() + getSideLength2() + getBaseLength();
    }
    
    public void printArea() {
        triangle = new Triangle();
        while(true) {
            try {
                System.out.println("Type in the BaseLength of the Triangle");
                double arg1 = input.nextDouble();
                triangle.setBaseLength(arg1);
                System.out.println("BaseLength: " + arg1);

                System.out.println("Type in the Height of the Triangle");
                double arg2 = input.nextDouble();
                triangle.setHeight(arg2);
                System.out.println("Height: " + arg2);

                System.out.println("Area of Triangle is " + triangle.getArea());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }
    }
    
    public void printPerimeter() {
        triangle = new Triangle();
        while(true) {
            try {
               System.out.println("Type in SideLength-1 of the Triangle");
               double arg1 = input.nextDouble();
               triangle.setSideLength1(arg1);
               System.out.println("SideLength-1: " + arg1);

               System.out.println("Type in SideLength-2 of the Triangle");
               double arg2 = input.nextDouble();
               triangle.setSideLength2(arg2);
               System.out.println("SideLength-2: " + arg2);

               System.out.println("Type in BaseLength of the Triangle");
               double arg3 = input.nextDouble();
               triangle.setBaseLength(arg3);
               System.out.println("BaseLength: " + arg3);

               System.out.println("Perimeter of Triangle is " + triangle.getPerimeter());
               break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println(Screen.INVALID_DATA);
            }
        }   
    }
    
}
