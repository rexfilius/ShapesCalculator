package shapescalculator;
public class Triangle {
    
    private double height;
    private double baseLength;
    private double sideLength1;
    private double sideLength2;
    
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
        if(getBaseLength() <= 0 || getHeight() <= 0) {
            System.out.println("INVALID! Figure cannot be Zero or Negative");
        } else {
            double area = 0.5 * getBaseLength() * getHeight();
            System.out.println("\nBaseLength = " + getBaseLength() + 
                                "\nHeight = " + getHeight() + 
                                "\nArea of Triangle is " + area);
        }
    }
    public void calculatePerimeter() {
        if(getBaseLength() <= 0 || getSideLength1() <= 0 || getSideLength2() <= 0) {
            System.out.println("INVALID! Figure cannot be Zero or Negative");
        } else {
            double perimeter = getBaseLength() + getSideLength1() + getSideLength2();
            System.out.println("\nBaseLength = " + getBaseLength() + 
                                "\nSideLength1 = " + getSideLength1() + 
                                "\nSideLength2 = " + getSideLength2() + 
                                "\nPerimeter of Triangle is " + perimeter);
        }   
    }
}
