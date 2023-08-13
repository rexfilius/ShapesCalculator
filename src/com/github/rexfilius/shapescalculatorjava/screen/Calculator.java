
package com.github.rexfilius.shapescalculatorjava.screen;

import com.github.rexfilius.shapescalculatorjava.models.*;

import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void run() {

        Screen menu = new Screen();
        String switchInput = menu.firstMenu();
        String parameterInput;

        switch (switchInput) {
            case "Triangle" -> {
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Triangle().calculateArea(scanner);
                else
                    new Triangle().calculatePerimeter(scanner);
            }
            case "Circle" -> {
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Circle().calculateArea(scanner);
                else
                    new Circle().calculatePerimeter(scanner);
            }
            case "Square" -> {
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Square().calculateArea(scanner);
                else
                    new Square().calculatePerimeter(scanner);
            }
            case "Rectangle" -> {
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Rectangle().calculateArea(scanner);
                else
                    new Rectangle().calculatePerimeter(scanner);
            }
            case "Parallelogram" -> {
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Parallelogram().calculateArea(scanner);
                else
                    new Parallelogram().calculatePerimeter(scanner);
            }
            case "Trapezium" -> {
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Trapezium().calculateArea(scanner);
                else
                    new Trapezium().calculatePerimeter(scanner);
            }
        }
        Screen.thirdMenu();
    }

}
