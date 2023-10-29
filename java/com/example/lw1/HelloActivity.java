package com.example.lw1;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.Timer;

public class HelloActivity extends Activity
{
    private Integer counter = 0;
    long timerStart = SystemClock.elapsedRealtime();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        //long time;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        TextView textView = findViewById(R.id.textView);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.getText().equals("НАЖМИ!"))
                {
                    button1.setText("НАЖАТО!");
                }
                else
                {
                    button1.setText("НАЖМИ!");
                }

                long time1 = (SystemClock.elapsedRealtime() / 1000) - timerStart / 1000;
                textView.setText(String.valueOf(time1));
                timerStart = SystemClock.elapsedRealtime();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                long time1 = (SystemClock.elapsedRealtime() / 1000) - timerStart / 1000;
                textView.setText(String.valueOf(time1));
                timerStart = SystemClock.elapsedRealtime();
            }
        });
    }
}
