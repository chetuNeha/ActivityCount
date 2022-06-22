package com.codebele.countactivities;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

public class CountActivity {
     public static Integer count = 0;

    public static void IncrementCount(Context c) {
        count++;
        Toast.makeText(c, String.valueOf(count), Toast.LENGTH_SHORT).show();
        SharedPreferences sp = c.getSharedPreferences("your_prefs", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("countValue", count);
        editor.commit();

    }
    public static void DecrementCount(Context c){
        count--;
        Toast.makeText(c, String.valueOf(count), Toast.LENGTH_SHORT).show();
        SharedPreferences sp = c.getSharedPreferences("your_prefs", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("countValue", count);
        editor.commit();
    }
    public static void getCount(Context c){
        SharedPreferences sp = c.getSharedPreferences("your_prefs", Activity.MODE_PRIVATE);
        int myIntValue = sp.getInt("countValue", -1);
        Toast.makeText(c,String.valueOf(myIntValue),Toast.LENGTH_SHORT).show();
    }


}
