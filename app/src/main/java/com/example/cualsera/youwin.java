package com.example.cualsera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class youwin extends AppCompatActivity implements View.OnClickListener{

    EditText text;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youwin);



        boton = findViewById(R.id.btn_iniciar);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}