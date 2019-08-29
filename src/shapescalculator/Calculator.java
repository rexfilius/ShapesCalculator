
package shapescalculator;

public class Calculator {
    
    public static void run() {
        
        Screen menu = new Screen();
        String switchInput = menu.firstMenu();
        String parameterInput;
        
        switch(switchInput) {
            case "Triangle":
                parameterInput = menu.secondMenu();
                if(parameterInput.equals("Area"))
                    new Triangle().printArea();
                else
                    new Triangle().printPerimeter();
            break;
            
            case "Circle":
                parameterInput = menu.secondMenu();
                if(parameterInput.equals("Area"))
                    new Circle().printArea();
                else
                    new Circle().printPerimeter();
            break;
            
            case "Square":
                parameterInput = menu.secondMenu();
                if(parameterInput.equals("Area"))
                    new Square().printArea();
                else
                    new Square().printPerimeter();
            break;
            
            case "Rectangle":
                parameterInput = menu.secondMenu();
                if(parameterInput.equals("Area"))
                    new Rectangle().printArea();
                else
                    new Rectangle().printPerimeter();
            break;
            
            case "Parallelogram":
                parameterInput = menu.secondMenu();
                if(parameterInput.equals("Area"))
                    new Parallelogram().printArea();
                else
                    new Parallelogram().printPerimeter();
            break;
            
            case "Trapezium":
                parameterInput = menu.secondMenu();
                if(parameterInput.equals("Area"))
                    new Trapezium().printArea();
                else
                    new Trapezium().printPerimeter();
            break;
        }
        Screen.thirdMenu();
    }
    
}
