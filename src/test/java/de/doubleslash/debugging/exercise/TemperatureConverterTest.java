package de.doubleslash.debugging.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TemperatureConverterTest {

    @Test
     void testCelsiusToFahrenheit() {
        String input = "32C";
        double expectedOutput = 89.6;
        double result = TemperatureConverter.convertTemperature(input);
        assertEquals(expectedOutput, result, 0.01);
    }

    @Test
     void testFahrenheitToCelsius() {
        String input = "100F";
        double expectedOutput = 37.77778;
        double result = TemperatureConverter.convertTemperature(input);
        assertEquals(expectedOutput, result, 0.01);
    }

    @Test
     void testCelsiusToFahrenheitLowercase() {
        String input = "32c";
        double expectedOutput = 89.6;
        double result = TemperatureConverter.convertTemperature(input);
        assertEquals(expectedOutput, result, 0.01);
    }

    @Test
     void testFahrenheitToCelsiusLowercase() {
        String input = "100f";
        double expectedOutput = 37.77778;
        double result = TemperatureConverter.convertTemperature(input);
        assertEquals(expectedOutput, result, 0.01);
    }

    @Test
     void testInvalidScale() {
        String input = "100K";
        assertThrows(IllegalArgumentException.class, () -> TemperatureConverter.convertTemperature(input));
    }

    @Test
     void testInvalidFormat() {
        String input = "100";
        assertThrows(IllegalArgumentException.class, () -> TemperatureConverter.convertTemperature(input));
    }

    @Test
     void testEmptyInput() {
        String input = "";
        assertThrows(IllegalArgumentException.class, () -> TemperatureConverter.convertTemperature(input));
    }
}