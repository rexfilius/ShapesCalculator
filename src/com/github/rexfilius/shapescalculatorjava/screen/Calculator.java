
package com.github.rexfilius.shapescalculatorjava.screen;

import com.github.rexfilius.shapescalculatorjava.models.*;

public class Calculator {

    public static void run() {

        Screen menu = new Screen();
        String switchInput = menu.firstMenu();
        String parameterInput;

        switch (switchInput) {
            case "Triangle" -> {
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Triangle().calculateArea();
                else
                    new Triangle().calculatePerimeter();
            }
            case "Circle" -> {
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Circle().calculateArea();
                else
                    new Circle().calculatePerimeter();
            }
            case "Square" -> {
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Square().calculateArea();
                else
                    new Square().calculatePerimeter();
            }
            case "Rectangle" -> {
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Rectangle().calculateArea();
                else
                    new Rectangle().calculatePerimeter();
            }
            case "Parallelogram" -> {
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Parallelogram().calculateArea();
                else
                    new Parallelogram().calculatePerimeter();
            }
            case "Trapezium" -> {
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Trapezium().calculateArea();
                else
                    new Trapezium().calculatePerimeter();
            }
        }
        Screen.thirdMenu();
    }

}
