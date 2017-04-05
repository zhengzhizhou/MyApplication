package com.example.mymodule;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/4/5.
 */

public class NewClass {
    public void ButtonClick(ImageButton imageButton, final TextView textView){
        textView.setText(stringFromJNI());
    }
    static {
        System.loadLibrary("native-lib");
    }

    public native String stringFromJNI();
}