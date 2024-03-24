package com.example.medication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.medication.R;

public class DoctorPrescription extends AppCompatActivity implements View.OnClickListener {
    private Button add;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_prescriptions);

        // Gọi phương thức constructor để khởi tạo
        constructorDoctorPrescription();
    }

    public void constructorDoctorPrescription() {
        add = findViewById(R.id.button_add_new_prescription);
        // Đăng ký sự kiện click cho nút
        add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_add_new_prescription) {
            // Tạo Intent để chuyển đến NewPrescription
            Intent intent = new Intent(DoctorPrescription.this, NewPrescription.class);
            startActivity(intent);
        }
    }
}
