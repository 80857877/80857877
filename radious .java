// Circle.java

package com.cognizant.shapes;

public class Circle {
    private float radius;
    private float pi;

    // Constructor 1
    public Circle() {
        this.pi = 3.5f; // Default pi value
    }

    // Constructor 2
    public Circle(float radius) {
        this(); // Invoking default constructor to set default pi value
        this.radius = radius;
    }

    // Constructor 3
    public Circle(float radius, float pi) {
        this.pi = pi;
        this.radius = radius;
    }

    // Getters and setters for radius and pi (optional)
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }
}
