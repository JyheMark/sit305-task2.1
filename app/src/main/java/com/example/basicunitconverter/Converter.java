package com.example.basicunitconverter;

import java.util.HashMap;
import java.util.function.Function;

public abstract class Converter {
    private UnitTypes.UnitType _conversionCategory;
    protected HashMap<ConversionSet, Function<Double,Double>> _conversionSets;
    public Converter(UnitTypes.UnitType conversionCategory){
        _conversionCategory = conversionCategory;
        _conversionSets = new HashMap<>();
        createConversionSets();
    }

    public double convert(UnitTypes.Unit fromUnit, UnitTypes.Unit toUnit, double unitAmount){
        ConversionSet key = new ConversionSet(fromUnit, toUnit);

        if (UnitTypes.getUnitType(fromUnit) != _conversionCategory || !_conversionSets.containsKey(key))
            throw new IllegalArgumentException();

        return _conversionSets.get(key).apply(unitAmount);
    }
    protected abstract void createConversionSets();
}
