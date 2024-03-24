package com.example.medication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.medication.R;


public class NewMedication extends AppCompatActivity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_medication);

    }

    public void onSaveClicked(View v) {
        // Lấy dữ liệu từ các trường EditText
        EditText name = findViewById(R.id.name_medication);
        String medicationName = name.getText().toString();
        EditText number = findViewById(R.id.number_pills);
        String numberPills = number.getText().toString();
        EditText time = findViewById(R.id.time_to_drink);
        String timeToDrink = time.getText().toString();


        Intent resultIntent = new Intent();
        resultIntent.putExtra("medicationName", medicationName);
        resultIntent.putExtra("numberPills", numberPills);
        resultIntent.putExtra("timeToDrink", timeToDrink);
//
//        Log.d("NewMedication", "Medication Name: " + medicationName);
//        Log.d("numberPills", "numberPills Name: " + numberPills);
//        Log.d("timeToDrink", "timeToDrink Name: " + timeToDrink);
        setResult(RESULT_OK, resultIntent);
        // Đóng màn hình NewMedication
        finish();
    }

}
