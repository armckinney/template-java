package dev.armckinney.learnjava.shapes;

/**
 * Concrete implementation of a Circle
 */
public class Circle implements Shape {
    private final double radius;
    private static final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    public double getRadius() {
        return radius;
    }
}
