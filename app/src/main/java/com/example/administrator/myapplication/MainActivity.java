package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.mymodule.NewClass;
import com.example.mymodule2.NewClass2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton imageButton1 = (ImageButton)findViewById(R.id.imageButton);
        final ImageButton imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        final TextView textView = (TextView)findViewById(R.id.textView2);

        final NewClass newClass = new NewClass();
        final NewClass2 newClass2 = new NewClass2();
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newClass.ButtonClick(imageButton1, textView);

            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newClass2.Button2(imageButton2, textView);
            }
        });
    }
}

