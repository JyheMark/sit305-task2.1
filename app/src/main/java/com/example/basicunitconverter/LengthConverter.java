package com.example.basicunitconverter;

public class LengthConverter extends Converter {
    public LengthConverter() {

        super(UnitTypes.UnitType.LENGTH);
    }

    @Override
    protected void createConversionSets() {
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.INCH, UnitTypes.Unit.FOOT),amt -> {return amt / 12;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.INCH, UnitTypes.Unit.YARD),amt -> {return amt / 36;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.INCH, UnitTypes.Unit.MILE),amt -> {return amt / 63360;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.INCH, UnitTypes.Unit.CENTIMETRE),amt -> {return amt * 2.54;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.INCH, UnitTypes.Unit.METRE),amt -> {return amt / 39.34;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.INCH, UnitTypes.Unit.KILOMETRE),amt -> {return amt / 39370;});

        _conversionSets.put(new ConversionSet(UnitTypes.Unit.FOOT, UnitTypes.Unit.INCH),amt -> {return amt * 12;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.FOOT, UnitTypes.Unit.YARD),amt -> {return amt / 3;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.FOOT, UnitTypes.Unit.MILE),amt -> {return amt / 5280;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.FOOT, UnitTypes.Unit.CENTIMETRE),amt -> {return amt * 30.48;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.FOOT, UnitTypes.Unit.METRE),amt -> {return amt / 3.281;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.FOOT, UnitTypes.Unit.KILOMETRE),amt -> {return amt / 3281;});

        _conversionSets.put(new ConversionSet(UnitTypes.Unit.YARD, UnitTypes.Unit.FOOT),amt -> {return amt * 3;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.YARD, UnitTypes.Unit.INCH),amt -> {return amt * 36;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.YARD, UnitTypes.Unit.MILE),amt -> {return amt / 1760;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.YARD, UnitTypes.Unit.CENTIMETRE),amt -> {return amt * 91.44;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.YARD, UnitTypes.Unit.METRE),amt -> {return amt / 1.094;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.YARD, UnitTypes.Unit.KILOMETRE),amt -> {return amt / 1094;});

        _conversionSets.put(new ConversionSet(UnitTypes.Unit.MILE, UnitTypes.Unit.FOOT),amt -> {return amt * 5280;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.MILE, UnitTypes.Unit.YARD),amt -> {return amt * 1760;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.MILE, UnitTypes.Unit.INCH),amt -> {return amt * 63360;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.MILE, UnitTypes.Unit.CENTIMETRE),amt -> {return amt * 160934;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.MILE, UnitTypes.Unit.METRE),amt -> {return amt * 1609;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.MILE, UnitTypes.Unit.KILOMETRE),amt -> {return amt * 1.60934;});

        _conversionSets.put(new ConversionSet(UnitTypes.Unit.CENTIMETRE, UnitTypes.Unit.FOOT),amt -> {return amt / 30.48;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.CENTIMETRE, UnitTypes.Unit.YARD),amt -> {return amt / 91.44;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.CENTIMETRE, UnitTypes.Unit.MILE),amt -> {return amt / 160934;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.CENTIMETRE, UnitTypes.Unit.INCH),amt -> {return amt / 2.54;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.CENTIMETRE, UnitTypes.Unit.METRE),amt -> {return amt / 100;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.CENTIMETRE, UnitTypes.Unit.KILOMETRE),amt -> {return amt / 100000;});

        _conversionSets.put(new ConversionSet(UnitTypes.Unit.METRE, UnitTypes.Unit.FOOT),amt -> {return amt * 3.281;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.METRE, UnitTypes.Unit.YARD),amt -> {return amt * 1.094;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.METRE, UnitTypes.Unit.MILE),amt -> {return amt / 160934;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.METRE, UnitTypes.Unit.CENTIMETRE),amt -> {return amt * 100;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.METRE, UnitTypes.Unit.INCH),amt -> {return amt * 39.37;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.METRE, UnitTypes.Unit.KILOMETRE),amt -> {return amt / 1000;});

        _conversionSets.put(new ConversionSet(UnitTypes.Unit.KILOMETRE, UnitTypes.Unit.FOOT),amt -> {return amt * 3281;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.KILOMETRE, UnitTypes.Unit.YARD),amt -> {return amt * 1094;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.KILOMETRE, UnitTypes.Unit.MILE),amt -> {return amt / 1.60934;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.KILOMETRE, UnitTypes.Unit.CENTIMETRE),amt -> {return amt * 100000;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.KILOMETRE, UnitTypes.Unit.METRE),amt -> {return amt * 1000;});
        _conversionSets.put(new ConversionSet(UnitTypes.Unit.KILOMETRE, UnitTypes.Unit.INCH),amt -> {return amt * 39370;});
    }
}
