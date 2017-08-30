package pl.sda.poznan.excercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingTest {

    private Greeting greeting;

    @Before
    public void initialize() {
        greeting = new Greeting();
    }

    //Wymaganie 1
    @Test
    public void greet() throws Exception {
        ///AAA

        //Arrange

        //Act
        String result = greeting.greet("Jan");

        //Assert
        assertEquals("Hello, Jan", result);

    }
    //Wymaganie 2
    @Test
    public void shouldReturnGeneralGreetingWhenNameIsNull() {
        String greet = greeting.greet(null);
        assertEquals("Hello, my friend", greet);
    }

    //Wymaganie 3
    @Test
    public void shouldReturnUpperCase() {
        String result = greeting.greet("JAN");
        assertEquals("HELLO JAN", result);
    }

    //Wymaganie 4
    @Test
    public void shouldHandleTwoNames() {
        String result = greeting.greet("Jan", "Ala");
        assertEquals("Hello, Jan and Ala", result);

    }

    //Wymaganie 5
    @Test
    public void shouldHandleMultipleNames() {
        String result = greeting.greet("Piotr", "Anna", "Paulina");
        assertEquals("Hello, Piotr, Anna and Paulina", result);
    }


}