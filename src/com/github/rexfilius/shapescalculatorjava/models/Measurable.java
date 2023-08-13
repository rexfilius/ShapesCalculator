package com.github.rexfilius.shapescalculatorjava.models;

import java.util.Scanner;

public interface Measurable {

    double area();
    double perimeter();

    void calculateArea(Scanner scanner);
    void calculatePerimeter(Scanner scanner);
}
