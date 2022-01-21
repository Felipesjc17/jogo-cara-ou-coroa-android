package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    private ImageView imageCurrency;
    private Button idBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageCurrency = findViewById(R.id.imageCurrency);
        idBack = findViewById(R.id.idBack);

        int random = new Random().nextInt(2);
        imageCurrency.setImageResource(random == 0 ? R.drawable.moeda_cara : R.drawable.moeda_coroa);

        idBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}