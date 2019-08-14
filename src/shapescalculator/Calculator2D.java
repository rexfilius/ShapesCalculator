package shapescalculator;
import java.util.Arrays;
public class Calculator2D {
    public static void main(String[] args) {
        
        String[] list = {"Triangle", "Circle", "Square", "Rectangle", "Parallelogram", "Trapezium" };
        int select = (int)(list.length*Math.random());
        String[] parameter = {"Area", "Perimeter"};
        int check = (int) (parameter.length*Math.random());
        double arg = (Math.random() * 15);
        System.out.println("This Program Calculates The Area And Perimeter Of 2-Dimensional Shapes");
        System.out.println("List of Shapes: " + Arrays.toString(list));
      
      switch(list[select]) {
          case "Triangle":
              Triangle triangle = new Triangle();
              System.out.println("\nTriangle is Selected.");
              System.out.println(parameter[check] + " is selected.");
                if(parameter[check].equalsIgnoreCase("Area")) {
                    triangle.setBaseLength(arg);
                    triangle.setHeight(arg);
                    triangle.calculateArea();
                } else {
                    triangle.setBaseLength(arg);
                    triangle.setSideLength1(arg);
                    triangle.setSideLength2(arg);
                    triangle.calculatePerimeter();
                }
                break;
          
          case "Circle":
              Circle circle = new Circle();
              System.out.println("\nCircle is Selected.");
              System.out.println(parameter[check] + " is selected.");
              if(parameter[check].equalsIgnoreCase("Area")) {
                  circle.setRadius(arg);
                  circle.calculateArea();
              } else {
                  circle.setRadius(arg);
                  circle.calculateCircumference();
              }
              break;
          
          case "Square":
              Square square = new Square();
              System.out.println("\nSquare is Selected.");
              System.out.println(parameter[check] + " is selected.");
              if(parameter[check].equalsIgnoreCase("Area")) {
                  square.setSideLength(arg);
                  square.calculateArea();
              } else {
                  square.setSideLength(arg);
                  square.calculatePerimeter();
              }
              break;
              
          case "Rectangle":
              Rectangle rectangle = new Rectangle();
              System.out.println("\nRectangle is Selected.");
              System.out.println(parameter[check] + " is selected.");
              if(parameter[check].equalsIgnoreCase("Area")) {
                  rectangle.setBreadth(arg);
                  rectangle.setLength(arg);
                  rectangle.calculateArea();
              } else {
                  rectangle.setBreadth(arg);
                  rectangle.setLength(arg);
                  rectangle.calculatePerimeter();
              }
              break;
              
          case "Parallelogram":
              Parallelogram parallel = new Parallelogram();
              System.out.println("\nParallelogram is Selected.");
              System.out.println(parameter[check] + " is selected.");
              if(parameter[check].equalsIgnoreCase("Area")) {
                  parallel.setBaseLength(arg);
                  parallel.setHeight(arg);
                  parallel.calculateArea();
              } else {
                  parallel.setSideLength(arg);
                  parallel.setBaseLength(arg);
                  parallel.calculatePerimeter();
              }
              break;
              
          case "Trapezium":
              Trapezium trap = new Trapezium();
              System.out.println("\nTrapezium is Selected.");
              System.out.println(parameter[check] + " is selected.");
              if(parameter[check].equalsIgnoreCase("Area")) {
                  trap.setTopLength(arg);
                  trap.setBaseLength(arg);
                  trap.setHeight(arg);
                  trap.calculateArea();
              } else {
                  trap.setBaseLength(arg);
                  trap.setTopLength(arg);
                  trap.setSideLength1(arg);
                  trap.setSideLength2(arg);
                  trap.calculatePerimeter();
              }
              break;
      }
      System.out.println("\nEND OF PROGRAM");  
    }   
}
 