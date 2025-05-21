package dev.armckinney.learnjava;

import dev.armckinney.learnjava.shapes.Circle;
import dev.armckinney.learnjava.shapes.Rectangle;
import dev.armckinney.learnjava.shapes.Shape;
import dev.armckinney.learnjava.services.ShapeService;
import java.util.Arrays;
import java.util.List;

/**
 * Main application class demonstrating the use of shapes
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create some shapes
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Create a list of shapes
        List<Shape> shapes = Arrays.asList(circle, rectangle);

        // Create shape service
        ShapeService shapeService = new ShapeService();

        // Print details for all shapes
        System.out.println("Shape Details:");
        System.out.println("------------------------");
        shapeService.printShapeDetails(shapes);

        // Calculate and print totals
        System.out.println("Totals:");
        System.out.println("Total Area: " + shapeService.calculateTotalArea(shapes));
        System.out.println("Total Perimeter: " + shapeService.calculateTotalPerimeter(shapes));
    }
}
