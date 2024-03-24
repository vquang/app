package com.example.medication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.medication.R;
import com.example.medication.activity.base.MainActivity;
import com.example.medication.util.TransferActivity;

public class HomeActivity extends MainActivity {
    private Button statisticButton;
    private ImageView person;
    private Button healthButton;

    private Button prescriptionButton;

    private Button scheduleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        constructor();
    }

    @Override
    public void constructor() {
        super.constructor();

        statisticButton = findViewById(R.id.statisticButton);
        healthButton = findViewById(R.id.healthButton);
        prescriptionButton = findViewById(R.id.prescriptionButton);
        scheduleButton = findViewById(R.id.scheduleButton);
        person = findViewById(R.id.person_1);

        statisticButton.setOnClickListener(this);
        healthButton.setOnClickListener(this);
        scheduleButton.setOnClickListener(this);
        prescriptionButton.setOnClickListener(this);
        person.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);

        int id = v.getId();

        if (id == R.id.statisticButton)
            TransferActivity.transferActivity(this, StatisticActivity.class);
        else if (id == R.id.healthButton)
            TransferActivity.transferActivity(this, HealthAssessmentActivity.class);
        else if (id == R.id.prescriptionButton)
            TransferActivity.transferActivity(this, ListPrescription.class);
        else if (id == R.id.person_1)
            TransferActivity.transferActivity(this, MedicationSchedule.class);
    }

}
