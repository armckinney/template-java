package dev.armckinney.learnjava.services;

import dev.armckinney.learnjava.shapes.Shape;
import java.util.List;

/**
 * Service class to demonstrate working with shapes
 */
public class ShapeService {
    /**
     * Calculate the total area of multiple shapes
     * @param shapes list of shapes to calculate total area for
     * @return the sum of all shape areas
     */
    public double calculateTotalArea(List<Shape> shapes) {
        return shapes.stream()
                    .mapToDouble(Shape::calculateArea)
                    .sum();
    }

    /**
     * Calculate the total perimeter of multiple shapes
     * @param shapes list of shapes to calculate total perimeter for
     * @return the sum of all shape perimeters
     */
    public double calculateTotalPerimeter(List<Shape> shapes) {
        return shapes.stream()
                    .mapToDouble(Shape::calculatePerimeter)
                    .sum();
    }

    /**
     * Print details for all shapes
     * @param shapes list of shapes to print details for
     */
    public void printShapeDetails(List<Shape> shapes) {
        shapes.forEach(shape -> {
            System.out.println("Shape: " + shape.getName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println("------------------------");
        });
    }
}
