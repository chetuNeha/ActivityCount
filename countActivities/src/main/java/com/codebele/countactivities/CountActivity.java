package com.codebele.countactivities;

import android.content.Context;
import android.widget.Toast;

public class CountActivity {
    Integer count;
    public  void setCount(Context c, Integer message){
        count =message;
        if(count>0){
            Toast.makeText(c,String.valueOf(count),Toast.LENGTH_SHORT).show();
        }

    }
}
