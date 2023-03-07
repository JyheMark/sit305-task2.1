package com.example.basicunitconverter;

import static com.example.basicunitconverter.UnitTypes.UnitType.LENGTH;
import static com.example.basicunitconverter.UnitTypes.UnitType.TEMPERATURE;
import static com.example.basicunitconverter.UnitTypes.UnitType.WEIGHT;

public class UnitTypes {
    public enum UnitType{
        LENGTH,
        WEIGHT,
        TEMPERATURE
    }


    public enum Unit {
        POUND,
        OUNCE,
        TON,
        GRAM,
        KILOGRAM,
        INCH,
        FOOT,
        YARD,
        MILE,
        CENTIMETRE,
        METRE,
        KILOMETRE,
        CELSIUS,
        FAHRENHEIT,
        KELVIN
    }

    public static UnitType getUnitType(Unit unit){
        switch(unit){
            case POUND:
            case OUNCE:
            case TON:
            case GRAM:
            case KILOGRAM:
                return WEIGHT;
            case INCH:
            case FOOT:
            case YARD:
            case MILE:
            case CENTIMETRE:
            case METRE:
            case KILOMETRE:
                return LENGTH;
            case CELSIUS:
            case FAHRENHEIT:
            case KELVIN:
                return TEMPERATURE;
            default:
                throw new IllegalArgumentException();
        }
    }
}
