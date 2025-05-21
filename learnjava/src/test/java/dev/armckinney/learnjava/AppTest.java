package dev.armckinney.learnjava;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    @Test
    public void mainMethodShouldExecuteWithoutError() {
        // This test verifies the main method can be executed without throwing exceptions
        App.main(new String[]{});
        // If we reach this point, the test passes as no exception was thrown
        assertThat(true).isTrue();
    }
}
