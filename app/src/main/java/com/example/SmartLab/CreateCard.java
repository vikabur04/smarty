package com.example.SmartLab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.SmartLab.MainPage.MainActivity;

public class CreateCard extends AppCompatActivity {
    private Button next;
    private Button create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_card);
        next=(Button) findViewById(R.id.btnNextCard);
        create=(Button) findViewById(R.id.btnCreate);

        next.setOnClickListener(v -> {
            Intent code = new Intent(CreateCard.this, MainActivity.class);
            startActivity(code);
        });

        create.setOnClickListener(v -> {
            Intent code = new Intent(CreateCard.this, MainActivity.class);
            startActivity(code);
        });
    }
}