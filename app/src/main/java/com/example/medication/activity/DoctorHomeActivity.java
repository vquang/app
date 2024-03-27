package com.example.medication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.medication.R;

public class DoctorHomeActivity extends AppCompatActivity {
    private Button doctorprescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_home_activity);

        doctorprescription = findViewById(R.id.prescriptions_doctor);
        doctorprescription.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorHomeActivity.this, DoctorPrescription.class);
                startActivity(intent);
            }
        });
    }
}