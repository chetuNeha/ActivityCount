package com.codebele.activitycountapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.codebele.countactivities.CountActivity;

public class MainActivity extends AppCompatActivity {
Button btn_click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_click =(Button)findViewById(R.id.btn_click);
        CountActivity.IncrementCount(getApplicationContext()); //Increment Count by 1
        openSecondActivity();// open next Activity method
    }

    private void openSecondActivity() {
        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //open second Activity when click on button
                startActivity(new Intent(getApplicationContext(),MainActivity2.class));
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        CountActivity.DecrementCount(getApplicationContext()); // decrement count value by 1 if activity is destroyed
    }
}