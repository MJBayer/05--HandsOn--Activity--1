package com.example.swappercheckermuit;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MessageDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_layout);

        TextView result = findViewById(R.id.result);
        Intent intent = getIntent();
        String Message = intent.getStringExtra("result");
        result.setText(Message);
    }
}
