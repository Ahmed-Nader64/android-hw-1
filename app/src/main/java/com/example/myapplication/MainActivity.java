package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText quize = findViewById(R.id.Quizes);
        EditText hw = findViewById(R.id.Home_Work);
        EditText mt = findViewById(R.id.Med_Terms);
        EditText fin = findViewById(R.id.Final);
        Button cal = findViewById(R.id.Calculate);
        TextView total = findViewById(R.id.Result);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            int num1 = Integer.parseInt(quize.getText().toString());
            int num2 = Integer.parseInt(hw.getText().toString());
            int num3 = Integer.parseInt(mt.getText().toString());
            int num4 = Integer.parseInt(fin.getText().toString());
            int tot = num1 + num2 + num3 + num4;
            total.setText(tot + "%");
            }
        });
    }
}