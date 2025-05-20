package dev.armckinney.learnjava.services;

import dev.armckinney.learnjava.shapes.Circle;
import dev.armckinney.learnjava.shapes.Rectangle;
import dev.armckinney.learnjava.shapes.Shape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class ShapeServiceTest {
    
    private ShapeService shapeService;
    private Shape circle;
    private Shape rectangle;
    private List<Shape> shapes;

    @BeforeEach
    void setUp() {
        shapeService = new ShapeService();
        circle = new Circle(5.0);
        rectangle = new Rectangle(4.0, 6.0);
        shapes = Arrays.asList(circle, rectangle);
    }

    @Test
    @DisplayName("Should calculate total area of multiple shapes")
    void calculateTotalArea_ShouldSumAllAreas() {
        // Arrange
        double expectedArea = circle.calculateArea() + rectangle.calculateArea();

        // Act
        double actualArea = shapeService.calculateTotalArea(shapes);

        // Assert
        assertThat(actualArea).isEqualTo(expectedArea);
    }

    @Test
    @DisplayName("Should calculate total perimeter of multiple shapes")
    void calculateTotalPerimeter_ShouldSumAllPerimeters() {
        // Arrange
        double expectedPerimeter = circle.calculatePerimeter() + rectangle.calculatePerimeter();

        // Act
        double actualPerimeter = shapeService.calculateTotalPerimeter(shapes);

        // Assert
        assertThat(actualPerimeter).isEqualTo(expectedPerimeter);
    }

    @Test
    @DisplayName("Should handle empty list of shapes")
    void calculateTotals_ShouldHandleEmptyList() {
        // Arrange
        List<Shape> emptyList = Collections.emptyList();

        // Act & Assert
        assertThat(shapeService.calculateTotalArea(emptyList)).isZero();
        assertThat(shapeService.calculateTotalPerimeter(emptyList)).isZero();
    }
}
