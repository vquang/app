package com.example.medication.activity;

import android.os.Bundle;

import com.example.medication.R;
import com.example.medication.activity.base.MainActivity;

public class StatisticActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistic_activity);

        constructor();
    }
}
