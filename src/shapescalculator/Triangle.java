
package shapescalculator;
import java.util.Scanner;
public class Triangle extends Shape {
    
    private double getArea() {
        return getBaseLength() * getHeight();
    }
    
    private double getPerimeter() {
        return getSideLength1() + getSideLength2() + getBaseLength();
    }
    
    public void printArea() {
        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle();
        while(true) {
            System.out.println("Type in Baselength & Height");
            try {
                double arg1 = input.nextDouble();
                triangle.setBaseLength(arg1);
                double arg2 = input.nextDouble();
                triangle.setHeight(arg2);
                System.out.println("Area of Triangle is " + triangle.getArea());
                break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println("\nYOU ENTERED INVALID DATA\n");
            }
        }
    }
    
    public void printPerimeter() {
        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle();
        while(true) {
            try {
               System.out.println("Type in SideLength1, SideLength2 & BaseLength");
               double arg1 = input.nextDouble();
               triangle.setSideLength1(arg1);
               double arg2 = input.nextDouble();
               triangle.setSideLength2(arg2);
               double arg3 = input.nextDouble();
               triangle.setBaseLength(arg3);
               System.out.println("Perimeter of Triangle is " + triangle.getPerimeter());
               break;
            } catch(Exception e) {
                input.nextLine();
                System.out.println("\nYOU ENTERED INVALID DATA\n");
            }
        }   
    }
    
}
