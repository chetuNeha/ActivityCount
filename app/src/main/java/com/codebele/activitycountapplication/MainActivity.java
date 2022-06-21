package com.codebele.activitycountapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codebele.countactivities.CountActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}