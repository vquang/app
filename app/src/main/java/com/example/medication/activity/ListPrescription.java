package com.example.medication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.medication.R;

public class ListPrescription extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_prescription);

        LinearLayout prescription_1 = findViewById(R.id.prescript_1);
        prescription_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý khi LinearLayout được nhấn
                startActivity(new Intent(ListPrescription.this, DetailPrescription.class));

            }
        });
    }
//    private void handlePrescriptionClick(LinearLayout prescription) {
//        // Thực hiện xử lý khi một LinearLayout được nhấn
//        // Ví dụ: Hiển thị thông báo cho người dùng về LinearLayout đã được nhấn
//
//
//    }

}
