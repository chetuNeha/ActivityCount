package com.codebele.countactivities;

import android.content.Context;
import android.widget.Toast;

public class CountActivity {
    Integer count;
    public static void setCount(Context c, Integer count){

        Toast.makeText(c,String.valueOf(count),Toast.LENGTH_SHORT).show();
        }
}
