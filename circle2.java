package com.cognizant.geometry;
import com.cognizant.shapes.Circle;

public class Shape {
    public static void main(String[] args) {
        // Creating an instance of Circle using the default constructor
        Circle circle = new Circle();

        // Accessing the radius using getter method
        float defaultRadius = circle.getRadius();
        System.out.println("Default radius of the circle: " + defaultRadius);
    }
}
    
}
