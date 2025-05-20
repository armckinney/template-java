package dev.armckinney.learnjava.shapes;

/**
 * Interface defining the common behavior for all shapes
 */
public interface Shape {
    /**
     * Calculate the area of the shape
     * @return the area as a double
     */
    double calculateArea();

    /**
     * Calculate the perimeter of the shape
     * @return the perimeter as a double
     */
    double calculatePerimeter();

    /**
     * Get the name of the shape
     * @return the shape name as a String
     */
    String getName();
}
