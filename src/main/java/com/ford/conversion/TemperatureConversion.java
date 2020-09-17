package com.ford.conversion;

public class TemperatureConversion {
    public double conversionToFahrenheit(int celsius) {
        return (9*celsius/5)+32;
    }

    public int conversionToCelsius(double fahrenheit) {
        return (int) (((fahrenheit-32)*0.5556));
    }

    public double conversionToKelvinFromCelsius(int celsius) {
        return celsius+273.15;
    }

    public int conversionToCelsiusFromKelvin(double kelvin) {
        return (int) (kelvin-273.15);
    }

    public double conversionFromKelvinToFahrenheit(int kelvin) {
        return  ((kelvin*9)/5-459.67);
    }

    public int conversionFromFahrenheitToKelvin(double fahrenheit) {
        return (int) ((fahrenheit+459.67)*5/9);
    }
}
