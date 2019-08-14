package shapescalculator;
public class Trapezium {
    
    private double height;
    private double topLength;
    private double baseLength;
    private double sideLength1;
    private double sideLength2;
    
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getTopLength() {
        return topLength;
    }
    public void setTopLength(double topLength) {
        this.topLength = topLength;
    }
    public double getBaseLength() {
        return baseLength;
    }
    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }
    public double getSideLength1() {
        return sideLength1;
    }
    public void setSideLength1(double sideLength1) {
        this.sideLength1 = sideLength1;
    }
    public double getSideLength2() {
        return sideLength2;
    }
    public void setSideLength2(double sideLength2) {
        this.sideLength2 = sideLength2;
    }
    public void calculateArea() {
        if(getTopLength() <= 0 || getBaseLength() <= 0 || getHeight() <= 0){
            System.out.println("INVALID! Figure cannot be Zero or Negative");
        } else {
            double area = (0.5 * (getTopLength() + getBaseLength())) * getHeight();
            System.out.println("\nTopLength = " + getTopLength() + 
                                "\nBaseLength = " + getBaseLength() + 
                                "\nHeight = " + getHeight() + 
                                "\nArea of Trapezium = " + area);
        } 
    }
    public void calculatePerimeter() {
        if(getBaseLength() <= 0 || getTopLength() <= 0 || getSideLength1() <= 0 || getSideLength2() <= 0) {
            System.out.println("INVALID! Figure cannot be Zero or Negative");
        } else {
            double perimeter = getTopLength() + getBaseLength() + getSideLength1() + getSideLength2();
            System.out.println("\nTopLength = " + getTopLength() + 
                                "\nBaseLength = " + getBaseLength() + 
                                "\nSideLength1 = " + getSideLength1() + 
                                "\nSideLength2 = " + getSideLength2() + 
                                "\nPerimeter of Trapezium = " + perimeter);
        } 
    }
}
