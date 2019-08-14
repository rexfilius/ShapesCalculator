package shapescalculator;
public class Rectangle {
    
    private double length;
    private double breadth;
    
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public void calculateArea() {
        if(getLength() <= 0 || getBreadth() <= 0) {
            System.out.println("INVALID! Figure cannot be Zero or Negative");
        } else {
            double area = getLength() * getBreadth();
            System.out.println("\nLength = " + getLength() + 
                                "\nBreadth = " + getBreadth() + 
                                "\nArea of Rectangle = " + area);
        } 
    }
    public void calculatePerimeter() {
        if(getLength() <= 0 || getBreadth() <= 0) {
            System.out.println("INVALID! Figure cannot be Zero or Negative");
        } else {
            double perimeter = 2 * (getLength() + getBreadth());
            System.out.println("\nLength = " + getLength() + 
                                "\nBreadth = " + getBreadth() + 
                                "\nPerimeter of Rectangle = " + perimeter);
        }
    }
}
