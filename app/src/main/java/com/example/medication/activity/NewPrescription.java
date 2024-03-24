package com.example.medication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.medication.R;

import org.w3c.dom.Text;

public class NewPrescription extends AppCompatActivity {
    private Button addButton,saveButton;
    private TableLayout tableLayout;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_prescription);
        addButton = findViewById(R.id.button_add_medication_prescription);
        saveButton = findViewById(R.id.button_save_prescription_doctor);
        tableLayout = findViewById(R.id.new_prescription);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addRowToTable();
            }
        });
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NewPrescription.this,"New prescription saved", Toast.LENGTH_SHORT).show();

            }
        });

    }
    private void addRowToTable() {
        TableRow row = new TableRow(this);

        // Create EditTexts for each column
        EditText medicationEditText = new EditText(this);
//        medicationEditText.setHint("Medication Name");
        medicationEditText.setGravity(Gravity.CENTER);
        medicationEditText.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 2));
        medicationEditText.setBackgroundResource(R.drawable.border);

        EditText quantityEditText = new EditText(this);
//        quantityEditText.setHint("Quantity");
        quantityEditText.setInputType(InputType.TYPE_CLASS_NUMBER);
        quantityEditText.setGravity(Gravity.CENTER);
        quantityEditText.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 2));
        quantityEditText.setBackgroundResource(R.drawable.border);

        EditText noteEditText = new EditText(this);
//        noteEditText.setHint("Note");
        noteEditText.setGravity(Gravity.CENTER);
        noteEditText.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 2));
        noteEditText.setBackgroundResource(R.drawable.border);
        // Add EditTexts to the row
        row.addView(medicationEditText);
        row.addView(quantityEditText);
        row.addView(noteEditText);

        // Add the row to the table
        tableLayout.addView(row);
    }

}
