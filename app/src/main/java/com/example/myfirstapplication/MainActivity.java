package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    private EditText editText;
    private Button sendButton;
    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.editText);
        sendButton = findViewById(R.id.sendButton);
        displayText = findViewById(R.id.displayText);


        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                displayText.setText(message);
            }
        });
    }
}


