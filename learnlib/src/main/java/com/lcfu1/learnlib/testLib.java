package com.lcfu1.learnlib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;

public class testLib {
    private static Toast sToast;
    @SuppressLint("ShowToast")
    public static void showToast(Context context, String content){
        if(sToast==null){
            sToast=Toast.makeText(context,content,Toast.LENGTH_SHORT);
        }else {
            sToast.setText(content);
        }
        sToast.show();
    }
}