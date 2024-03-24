package com.example.medication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.medication.R;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class MedicationSchedule extends AppCompatActivity implements View.OnClickListener {
    private Button add;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medication_schedule);
        constructor();
    }

    public void constructor() {
        add = findViewById(R.id.button_add_medication);
        add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_add_medication) {
            Intent intent = new Intent(this, NewMedication.class);
            startActivityForResult(intent, 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            // Nhận dữ liệu được trả về từ NewMedication và cập nhật giao diện ở đây
            // Ví dụ: cập nhật bảng thuốc
            String medicationName = data.getStringExtra("medicationName");
            String numberPills = data.getStringExtra("numberPills");
            String timeToDrink = data.getStringExtra("timeToDrink");
            // Cập nhật giao diện với dữ liệu mới
            Log.d("NewMedication", "Medication Name: " + medicationName);
            Log.d("numberPills", "numberPills Name: " + numberPills);
            Log.d("timeToDrink", "timeToDrink Name: " + timeToDrink);
            Medication medication = new Medication(medicationName, Integer.parseInt(numberPills), timeToDrink);
            addNewRow(medication);
        }
    }

    private void addNewRow(Medication medication) {
        // Đầu tiên, tìm tham chiếu đến TableLayout
        TableLayout tableLayout = findViewById(R.id.table_prescription);

        // Tạo một TableRow mới
        TableRow newRow = new TableRow(this);
        newRow.setGravity(2);

        // Tạo và thêm TextView vào TableRow
        TextView medicineNameTextView = new TextView(this);
        medicineNameTextView.setText(medication.getNameMedication());
        newRow.addView(medicineNameTextView);
        medicineNameTextView.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 2));
        medicineNameTextView.setGravity(Gravity.CENTER);// Chia đều theo trọng số

        // Tạo và thêm TextView vào TableRow
        TextView quantityTextView = new TextView(this);
        quantityTextView.setText(String.valueOf(medication.getQuantity()));
        newRow.addView(quantityTextView);
        quantityTextView.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 2));
        quantityTextView.setGravity(Gravity.CENTER);// Chia đều theo trọng số

        // Tạo và thêm TextView vào TableRow
        TextView timeTextView = new TextView(this);
        timeTextView.setText(medication.getTime());
        newRow.addView(timeTextView);
        timeTextView.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 2));
        timeTextView.setGravity(Gravity.CENTER);// Chia đều theo trọng số

        // Tạo và thêm CheckBox vào TableRow
        CheckBox checkBox = new CheckBox(this);
        newRow.addView(checkBox);
        checkBox.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 2)); // Chia đều theo trọng số
        checkBox.setGravity(Gravity.CENTER);
        // Thêm TableRow mới vào TableLayout
        tableLayout.addView(newRow);

    }

}
