package de.doubleslash.debugging.exercise;

public class TemperatureConverter {

    public static void main(String[] args) {
    }

    public static double convertTemperature(String temperature) {
        char scale = temperature.charAt(temperature.length() - 1);
        double value = Double.parseDouble(temperature.substring(0, temperature.length() - 1));
        int divisor = 9 / 5;

        if (scale == 'C') {
            double fahrenheit = (value * divisor) + 32;
            System.out.println(value + " Celsius is " + fahrenheit + " Fahrenheit");
            return fahrenheit;
        } else if (scale == 'F') {
            double celsius = (value - 32) / divisor;
            System.out.println(value + " Fahrenheit is " + celsius + " Celsius");
            return celsius;
        } else {
            System.out.println("Invalid temperature scale!");
        }

        return 0.0;
    }
}