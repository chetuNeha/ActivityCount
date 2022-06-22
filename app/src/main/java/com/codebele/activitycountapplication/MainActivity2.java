package com.codebele.activitycountapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.codebele.countactivities.CountActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        CountActivity.IncrementCount(getApplicationContext()); // increment count value by 1 if activity is opened

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        CountActivity.DecrementCount(getApplicationContext());
    }
}