
package com.github.rexfilius.shapescalculatorjava.screen;

import com.github.rexfilius.shapescalculatorjava.models.*;

public class Calculator {

    public static void run() {

        Screen menu = new Screen();
        String switchInput = menu.firstMenu();
        String parameterInput;

        switch (switchInput) {
            case "Triangle":
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Triangle().calculateArea();
                else
                    new Triangle().calculatePerimeter();
                break;

            case "Circle":
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Circle().calculateArea();
                else
                    new Circle().calculatePerimeter();
                break;

            case "Square":
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Square().calculateArea();
                else
                    new Square().calculatePerimeter();
                break;

            case "Rectangle":
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Rectangle().calculateArea();
                else
                    new Rectangle().calculatePerimeter();
                break;

            case "Parallelogram":
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Parallelogram().calculateArea();
                else
                    new Parallelogram().calculatePerimeter();
                break;

            case "Trapezium":
                parameterInput = menu.secondMenu();
                if (parameterInput.equals("Area"))
                    new Trapezium().calculateArea();
                else
                    new Trapezium().calculatePerimeter();
                break;
        }
        Screen.thirdMenu();
    }

}
