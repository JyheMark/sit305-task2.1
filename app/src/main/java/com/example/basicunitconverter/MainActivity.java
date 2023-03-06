package com.example.basicunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
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
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show();
    }
}