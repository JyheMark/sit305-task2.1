package com.example.basicunitconverter;

public class WeightConverter extends Converter {
    public WeightConverter() {
        super(UnitTypes.UnitType.WEIGHT);
    }

    @Override
    protected void createConversionSets() {
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.POUND, UnitTypes.Unit.OUNCE), amt -> {return amt * 16;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.POUND, UnitTypes.Unit.TON), amt -> {return amt / 2000;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.POUND, UnitTypes.Unit.GRAM), amt -> {return amt * 453.6;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.POUND, UnitTypes.Unit.KILOGRAM), amt -> {return amt / 2.205;});

        _conversionSets.put(new ConversionSet(UnitTypes.Unit.OUNCE, UnitTypes.Unit.POUND), amt -> {return amt * 16;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.OUNCE, UnitTypes.Unit.TON), amt -> {return amt / 32000;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.OUNCE, UnitTypes.Unit.GRAM), amt -> {return amt * 28.35;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.OUNCE, UnitTypes.Unit.KILOGRAM), amt -> {return amt / 35.274;});

        _conversionSets.put(new ConversionSet(UnitTypes.Unit.TON, UnitTypes.Unit.OUNCE), amt -> {return amt * 35270;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.TON, UnitTypes.Unit.POUND), amt -> {return amt * 2205;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.TON, UnitTypes.Unit.GRAM), amt -> {return amt * 1000000;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.TON, UnitTypes.Unit.KILOGRAM), amt -> {return amt * 1000;});

        _conversionSets.put(new ConversionSet(UnitTypes.Unit.GRAM, UnitTypes.Unit.OUNCE), amt -> {return amt * 28.35;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.GRAM, UnitTypes.Unit.TON), amt -> {return amt / 907200;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.GRAM, UnitTypes.Unit.POUND), amt -> {return amt / 453.6;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.GRAM, UnitTypes.Unit.KILOGRAM), amt -> {return amt / 1000;});

        _conversionSets.put(new ConversionSet(UnitTypes.Unit.KILOGRAM, UnitTypes.Unit.OUNCE), amt -> {return amt * 35.274;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.KILOGRAM, UnitTypes.Unit.TON), amt -> {return amt / 907.2;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.KILOGRAM, UnitTypes.Unit.GRAM), amt -> {return amt * 1000;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.KILOGRAM, UnitTypes.Unit.POUND), amt -> {return amt * 2.205;});
    }
}
