package com.example.cualsera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gameover extends AppCompatActivity implements View.OnClickListener{

    TextView text,se;
    Button boton;
    int numero1 = 0, numerito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover);

        text = findViewById(R.id.elnumeroes);
        numero1 = getIntent().getIntExtra("valornumerico", 0);
        numerito = numero1;
        text.setText(""+numerito);

        boton = findViewById(R.id.btn_iniciar2);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}