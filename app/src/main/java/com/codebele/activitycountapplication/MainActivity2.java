package com.codebele.activitycountapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.codebele.countactivities.CountActivity;

public class MainActivity2 extends BaseActivity {
    Button btn_click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn_click =(Button)findViewById(R.id.btn_click);
        ++activityCount; // increment count value by 1 if activity is opened
        CountActivity.setCount(getApplicationContext(), activityCount);//passing count value to library and saves count

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        --activityCount; // decrement count value by 1 if activity is destroyed
    }
}