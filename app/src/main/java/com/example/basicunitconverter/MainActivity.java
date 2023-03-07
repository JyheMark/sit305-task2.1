package com.example.basicunitconverter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindSpinners();
    }

    private void bindSpinners() {
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this, R.array.unit_types, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item);

        bindSpinner(R.id.sourceUnitSpinner, arrayAdapter);
        bindSpinner(R.id.targetUnitSpinner, arrayAdapter);
    }

    private void bindSpinner(int spinnerId, ArrayAdapter<CharSequence> arrayAdapter){
        Spinner spinner = findViewById(spinnerId);

        if (spinner == null)
            throw new NullPointerException("Spinner could not be bound");

        spinner.setAdapter(arrayAdapter);
    }

    public void convertButtonOnClick(View view){
        validateInput();
    }

    private void validateInput() {
        validateUserAmount();
        validateUnitTypes();

        String sourceSpinnerSelection = extractTextFromSpinner(R.id.sourceUnitSpinner);
        UnitTypes.UnitType unitType = UnitTypes.getUnitType(UnitTypes.Unit.valueOf(sourceSpinnerSelection.toUpperCase()));

        UnitTypes.Unit sourceUnit = UnitTypes.Unit.valueOf(sourceSpinnerSelection.toUpperCase());

        String targetSpinnerSelect = extractTextFromSpinner(R.id.targetUnitSpinner);
        UnitTypes.Unit targetUnit = UnitTypes.Unit.valueOf(targetSpinnerSelect.toUpperCase());

        double unitConversionAmount = Double.parseDouble(extractTextFromTextEdit(R.id.sourceUnitAmount));

        double result = ConverterFactory.getConverter(unitType).convert(sourceUnit, targetUnit, unitConversionAmount);
    }

    private void validateUnitTypes() {
        String sourceSpinnerSelection = extractTextFromSpinner(R.id.sourceUnitSpinner).toUpperCase();
        String targetSpinnerSelection = extractTextFromSpinner(R.id.targetUnitSpinner).toUpperCase();

        if (sourceSpinnerSelection.equals(targetSpinnerSelection)){
            showToastMessage("Conversion units can not be the same");
            return;
        }

        UnitTypes.Unit sourceUnit = UnitTypes.Unit.valueOf(sourceSpinnerSelection);
        UnitTypes.Unit targetUnit = UnitTypes.Unit.valueOf(targetSpinnerSelection);

        if (!areUnitTypeSelectionsSameCategory(sourceUnit, targetUnit))
        {
            showToastMessage("Please ensure units are of the same category");
        }
    }

    private boolean areUnitTypeSelectionsSameCategory(UnitTypes.Unit sourceSpinnerSelection, UnitTypes.Unit targetSpinnerSelection) {
        return UnitTypes.getUnitType(sourceSpinnerSelection) == UnitTypes.getUnitType(targetSpinnerSelection);
    }

    private String extractTextFromSpinner(int spinnerId){
        Spinner spinner = findViewById(spinnerId);

        if (spinner == null)
            throw new NullPointerException("Could not resolve spinner with id "+spinnerId);

        return spinner.getSelectedItem().toString();
    }

    private void validateUserAmount() {
        String inputText = extractTextFromTextEdit(R.id.sourceUnitAmount);

        if (inputText.isEmpty()){
            showToastMessage("Please enter a unit amount to convert");
            return;
        }

        double unitAmount = Double.parseDouble(inputText);

        if (unitAmount <= 0)
            showToastMessage("Please enter a unit amount above 0");
    }

    @NonNull
    private String extractTextFromTextEdit(int textEditId) {
        EditText sourceUnitAmountTextInput = findViewById(textEditId);

        if (sourceUnitAmountTextInput == null)
            throw new NullPointerException("Could not resolve reference to TextEdit with id "+textEditId);

        return sourceUnitAmountTextInput.getText().toString();
    }

    private void showToastMessage(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}