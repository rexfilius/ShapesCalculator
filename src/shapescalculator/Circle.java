
package shapescalculator;
import static java.lang.Math.PI;
import java.util.Scanner;
public class Circle extends Shape{
    
    private double getArea() {
        return PI * getRadius() * getRadius();
    }
    
    private double getPerimeter() {
        return 2 * PI * getRadius();
    }
    
    public void printArea() {
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        while(true) {
            System.out.println("Type in the Radius");
            try {
                double arg = input.nextDouble();
                circle.setRadius(arg);
                System.out.println("Area of Circle is " + circle.getArea());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println("\nYOU ENTERED INVALID DATA\n");
            }
        }
    }
    
    public void printPerimeter() {
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        while(true) {
            System.out.println("Type in the Radius");
            try {
                double arg = input.nextDouble();
                circle.setRadius(arg);
                System.out.println("Circumference of Circle is " + circle.getPerimeter());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println("\nYOU ENTERED INVALID DATA\n");
            }
        }
    }
    
}