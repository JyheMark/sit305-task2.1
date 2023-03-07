package com.example.basicunitconverter;

public class ConverterFactory {
    public static Converter getConverter(UnitTypes.UnitType unitType){
        switch (unitType){
            case LENGTH:
                return new LengthConverter();
            case WEIGHT:
                return new WeightConverter();
            case TEMPERATURE:
                return new TemperatureConverter();
            default:
                throw new IllegalArgumentException();
        }
    }
}
