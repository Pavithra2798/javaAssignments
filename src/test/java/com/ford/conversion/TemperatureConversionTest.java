package com.ford.conversion;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureConversionTest {
    @Test
    public void shouldConvertCelsiusToFahrenheit(){
        TemperatureConversion degree = new TemperatureConversion();
        Assert.assertEquals(89.6,degree.conversionToFahrenheit(32),1);
    }
    @Test
    public void shouldConvertFahrenheitToCelsius(){
        TemperatureConversion degree = new TemperatureConversion();
        Assert.assertEquals(32,degree.conversionToCelsius(89.6));
    }
    @Test
    public void shouldConvertKelvinToCelsius(){
        TemperatureConversion degree = new TemperatureConversion();
        Assert.assertEquals(32,degree.conversionToCelsiusFromKelvin(305.15));
    }
    @Test
    public void shouldConvertCelsiusToKelvin(){
        TemperatureConversion degree = new TemperatureConversion();
        Assert.assertEquals(305.15,degree.conversionToKelvinFromCelsius(32),2);
    }
    @Test
    public void shouldConvertKelvinToFahrenheit(){
        TemperatureConversion degree = new TemperatureConversion();
        Assert.assertEquals(-402.07,degree.conversionFromKelvinToFahrenheit(32),2);
    }
    @Test
    public void shouldConvertFahrenheitToKelvin(){
        TemperatureConversion degree = new TemperatureConversion();
        Assert.assertEquals(32,degree.conversionFromFahrenheitToKelvin(-402.07));
    }

}
