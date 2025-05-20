package dev.armckinney.learnjava.shapes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;

class CircleTest {
    
    @Test
    @DisplayName("Circle should calculate area correctly")
    void calculateArea_ShouldReturnCorrectArea() {
        // Arrange
        Circle circle = new Circle(5.0);
        double expectedArea = Math.PI * 25.0; // π * r²

        // Act
        double actualArea = circle.calculateArea();

        // Assert
        assertThat(actualArea).isEqualTo(expectedArea);
    }

    @Test
    @DisplayName("Circle should calculate perimeter correctly")
    void calculatePerimeter_ShouldReturnCorrectPerimeter() {
        // Arrange
        Circle circle = new Circle(5.0);
        double expectedPerimeter = 2 * Math.PI * 5.0; // 2πr

        // Act
        double actualPerimeter = circle.calculatePerimeter();

        // Assert
        assertThat(actualPerimeter).isEqualTo(expectedPerimeter);
    }

    @Test
    @DisplayName("Circle should return correct name")
    void getName_ShouldReturnCircle() {
        // Arrange
        Circle circle = new Circle(5.0);

        // Act & Assert
        assertThat(circle.getName()).isEqualTo("Circle");
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.0, 2.5, 10.0, 100.0})
    @DisplayName("Circle should handle different radius values correctly")
    void circle_ShouldHandleVariousRadiusValues(double radius) {
        // Arrange & Act
        Circle circle = new Circle(radius);

        // Assert
        assertThat(circle.getRadius()).isEqualTo(radius);
        assertThat(circle.calculateArea()).isEqualTo(Math.PI * radius * radius);
        assertThat(circle.calculatePerimeter()).isEqualTo(2 * Math.PI * radius);
    }
}
