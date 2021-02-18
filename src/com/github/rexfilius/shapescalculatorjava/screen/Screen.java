
package com.github.rexfilius.shapescalculatorjava.screen;

import java.util.Scanner;

public class Screen {

    public static final String INVALID_DATA = "\nYOU ENTERED INVALID DATA\n";
    
    Scanner input = new Scanner(System.in);
    String select = null;
    String parameter = null;
    
    public String firstMenu() {
        System.out.println("This Application Calculates The Area And Perimeter Of 2-Dimensional Shapes");
        System.out.println("List of Shapes: [Triangle, Circle, Square, Rectangle, Parallelogram, Trapezium]");
        System.out.println("Select a Shape: [Type it in]");
        select = input.nextLine();
        checkFirstMenu();
        return select;
    }
    
    private void checkFirstMenu() {
        while(!(select.equals("Circle") || select.equals("Triangle")
                || select.equals("Square") || select.equals("Rectangle")
                || select.equals("Parallelogram") || select.equals("Trapezium"))) {
            System.out.println("\nCHECK YOUR CASING/WORDS. TYPE CORRECTLY\n");
            firstMenu();    
        }
    }
    
    public String secondMenu() {
        System.out.println("What do you want to calculate? Area or Perimeter?");
        System.out.println("Type it in:");
        parameter = input.nextLine();
        checkSecondMenu();
        return parameter;
    }
    
    private void checkSecondMenu() {
        while(!(parameter.equals("Area") || parameter.equals("Perimeter"))) {
            System.out.println("\nCHECK YOUR CASING/WORDS. TYPE CORRECTLY\n");
            secondMenu();
        }
    }
    
    public static void thirdMenu() {
        System.out.println("\nPress 1 to go back to Menu\nPress 2 to End");
        try {
            Scanner sc = new Scanner(System.in);
            int d = sc.nextInt();
            switch(d) {
                case 1:
                    Calculator.run();
                    break;
                case 2:
                    System.out.println("program is ending...");
                    break;
                default:
                    System.out.println("Invalid Input");
                    Screen.thirdMenu();
                    break;
            }
        } catch(Exception e) {
            System.out.println("\nInvalid Input\n");
            Screen.thirdMenu();
        }
    }
    
}
