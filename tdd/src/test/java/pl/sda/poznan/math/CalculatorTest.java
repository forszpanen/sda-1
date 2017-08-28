package pl.sda.poznan.math;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class CalculatorTest {


    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 2);

        assertEquals(4, result);
    }

    @Test
    public void testAddition() {
        fail("Function not implemented");
    }

    @Test
    public void testDivision() {
        // AAA
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int divide = calculator.divide(2, 2);

        // Assert
        assertEquals(1, divide);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        // Arrange
        Calculator calculator = new Calculator();

        //Act
        calculator.divide(2, 0);

        //Assert ?


    }
}
