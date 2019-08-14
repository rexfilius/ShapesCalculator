package shapescalculator;
public class Parallelogram {
    
    private double height;
    private double baseLength;
    private double sideLength;
    
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getBaseLength() {
        return baseLength;
    }
    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }
    public double getSideLength() {
        return sideLength;
    }
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    public void calculateArea() {
        if(getBaseLength() <= 0 || getHeight() <= 0) {
            System.out.println("INVALID! Figure cannot be Zero or Negative");
        } else {
            double area = getBaseLength() * getHeight();
            System.out.println("\nBaseLength = " + getBaseLength() + 
                                "\nHeight = " + getHeight() + 
                                "\nArea of Parallelogram = " + area);
        }
    }
    public void calculatePerimeter() {
        if(getBaseLength() <= 0 || getSideLength() <= 0) {
            System.out.println("INVALID! Figure cannot be Zero or Negative");
        } else {
            double perimeter = 2 * (getBaseLength() + getSideLength());
            System.out.println("\nBaseLength = " + getBaseLength() + 
                                "\nSideLength = " + getSideLength() + 
                                "\nPerimeter of Parallelogram = " + perimeter);
        } 
    }
}
