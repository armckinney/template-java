package dev.armckinney.learnjava.shapes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.assertThat;

class RectangleTest {
    
    @Test
    @DisplayName("Rectangle should calculate area correctly")
    void calculateArea_ShouldReturnCorrectArea() {
        // Arrange
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        double expectedArea = 24.0; // width * height

        // Act
        double actualArea = rectangle.calculateArea();

        // Assert
        assertThat(actualArea).isEqualTo(expectedArea);
    }

    @Test
    @DisplayName("Rectangle should calculate perimeter correctly")
    void calculatePerimeter_ShouldReturnCorrectPerimeter() {
        // Arrange
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        double expectedPerimeter = 20.0; // 2(width + height)

        // Act
        double actualPerimeter = rectangle.calculatePerimeter();

        // Assert
        assertThat(actualPerimeter).isEqualTo(expectedPerimeter);
    }

    @Test
    @DisplayName("Rectangle should return correct name")
    void getName_ShouldReturnRectangle() {
        // Arrange
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Act & Assert
        assertThat(rectangle.getName()).isEqualTo("Rectangle");
    }

    @Test
    @DisplayName("Rectangle should maintain width and height values")
    void rectangle_ShouldMaintainDimensions() {
        // Arrange
        double width = 4.0;
        double height = 6.0;
        
        // Act
        Rectangle rectangle = new Rectangle(width, height);

        // Assert
        assertThat(rectangle.getWidth()).isEqualTo(width);
        assertThat(rectangle.getHeight()).isEqualTo(height);
    }
}
