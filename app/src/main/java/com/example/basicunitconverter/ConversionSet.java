package com.example.basicunitconverter;

public class ConversionSet {
    private UnitTypes.Unit _unitFrom;
    private UnitTypes.Unit _unitTo;

    public ConversionSet(UnitTypes.Unit unitFrom, UnitTypes.Unit unitTo){
        _unitFrom = unitFrom;
        _unitTo = unitTo;
    }
    public UnitTypes.Unit getUnitFrom(){
        return _unitFrom;
    }
    public UnitTypes.Unit getUnitTo(){
        return _unitTo;
    }
}
