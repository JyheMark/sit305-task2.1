package com.example.basicunitconverter;
public class TemperatureConverter extends Converter{
    public TemperatureConverter() {
        super(UnitTypes.UnitType.TEMPERATURE);
    }

    @Override
    protected void createConversionSets() {
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.CELSIUS, UnitTypes.Unit.FAHRENHEIT), amt -> {return amt * 1.8 + 32;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.CELSIUS, UnitTypes.Unit.KELVIN), amt -> {return amt + 273.15;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.FAHRENHEIT, UnitTypes.Unit.CELSIUS), amt -> {return amt - 32 / 1.8;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.FAHRENHEIT, UnitTypes.Unit.KELVIN), amt -> {return (amt - 32) * 5/9 + 273.15;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.KELVIN, UnitTypes.Unit.CELSIUS), amt -> {return amt - 273.15;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.KELVIN, UnitTypes.Unit.FAHRENHEIT), amt -> {return (amt - 273.15) * 9/5 + 32;});
    }
}
