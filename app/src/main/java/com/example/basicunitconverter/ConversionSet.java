package com.example.basicunitconverter;

import androidx.annotation.Nullable;

import java.util.Objects;

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

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == this)
            return true;

        if (!(obj instanceof ConversionSet))
            return false;

        ConversionSet compare = (ConversionSet) obj;

        return this._unitTo == compare.getUnitTo() && this._unitFrom == compare.getUnitFrom();
    }

    @Override
    public int hashCode() {
        return Objects.hash(_unitFrom, _unitTo);
    }
}
