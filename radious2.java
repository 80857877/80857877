// Area.java

package com.cognizant.shapes;

public class Area {
    public static void main(String[] args) {
        float radiusValue = 5.0f; // Example value for radius

        // Using Constructor 2 by passing radius as an argument
        Circle circle1 = new Circle(radiusValue);

        // Example usage of Constructor 3 by passing radius and custom pi value
        float customPi = 3.14f; // Custom pi value
        Circle circle2 = new Circle(radiusValue, customPi);

        // Accessing radius and pi values of created circles (optional)
        System.out.println("Circle 1 - Radius: " + circle1.getRadius() + ", Pi: " + circle1.getPi());
        System.out.println("Circle 2 - Radius: " + circle2.getRadius() + ", Pi: " + circle2.getPi());
    }
}
