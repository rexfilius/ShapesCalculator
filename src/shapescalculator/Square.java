package shapescalculator;
public class Square {
    
    private double sideLength;
    
    public double getSideLength() {
        return sideLength;
    }
    public void setSideLength(double sideLength) {
           this.sideLength = sideLength; 
    }
    public void calculateArea() {
        if(getSideLength() <= 0) {
            System.out.println("INVALID! Figure cannot be Zero or Negative");
        } else {
            double area = getSideLength() * getSideLength();
            System.out.println("\nSideLength = " + getSideLength() + 
                                "\nArea of Square = " + area);
        }   
    }
    public void calculatePerimeter() {
        if(getSideLength() <= 0) {
            System.out.println("INVALID! Figure cannot be Zero or Negative");
        } else {
            double perimeter = 4 * getSideLength();
            System.out.println("\nSideLength = " + getSideLength() + 
                                "\nPerimeter of Square = " + perimeter);
        }
    }
}
