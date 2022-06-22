package com.codebele.countactivities;

import android.content.Context;
import android.widget.Toast;

public class CountActivity {
     public static Integer count = 0;

    public static void IncrementCount(Context c) {
        count++;
        Toast.makeText(c, String.valueOf(count), Toast.LENGTH_SHORT).show();
    }
    public static void DecrementCount(Context c){
        count--;
        Toast.makeText(c, String.valueOf(count), Toast.LENGTH_SHORT).show();
    }
}
