package shapescalculator;
import static java.lang.Math.PI;
public class Circle {
    
    private double radius;
    
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void calculateArea() {
        if(getRadius() <= 0) {
            System.out.println("INVALID! Figure cannot be Zero or Negative");
        } else {
          double area = PI * getRadius() * getRadius();
          System.out.println("\nRadius of Circle = " + getRadius() + 
                             "\nArea of Circle = " + area);
        }
    }
    public void calculateCircumference() {
        if(getRadius() <= 0) {
            System.out.println("INVALID! Figure cannot be Zero or Negative");
        } else {
            double circumference = 2 * PI * getRadius();
            System.out.println("\nRaius of Circle = " + getRadius() + 
                               "\nCicrcumference of Circle = " + circumference);
        }  
    }
}