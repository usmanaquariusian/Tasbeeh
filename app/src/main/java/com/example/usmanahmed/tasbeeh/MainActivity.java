package com.example.usmanahmed.tasbeeh;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button tick,reset;
    TextView display;
    int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tick=(Button) findViewById(R.id.button);
        reset=(Button) findViewById(R.id.button2);
        display=(TextView) findViewById(R.id.textView);

        display.setText("Total = "+count);

        tick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                display.setText("Total = "+count);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("Total = 0");
                count=0;
            }
        });


    }
}
