package com.example.cualsera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

import static android.widget.Toast.makeText;

public class HomeActivity2 extends AppCompatActivity implements View.OnClickListener {

    int value = 0, aleatorio = 0, intentos = 0, numintento;
    String temp;
    EditText editText;
    Button valida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        editText = findViewById(R.id.Number);
        valida = findViewById(R.id.btnnumber);
        valida.setOnClickListener(this);
        aleatorio = (int) Math.floor(Math.random()*100);
        intentos = getIntent().getIntExtra("number", 0);
        numintento = intentos;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnnumber && numintento != 0) {
            if(editText.length() == 0){
                Toast.makeText(getApplicationContext(),"Casilla vacia",Toast.LENGTH_LONG).show();
            }else {
                value = Integer.parseInt(editText.getText().toString());
                if (value == aleatorio) {
                    Intent i = new Intent(getApplicationContext(), youwin.class);
                    startActivity(i);
                } else {
                    if (value < aleatorio) {
                        numintento--;
                        Toast.makeText(getApplicationContext(), "El numero ingresado es menor", Toast.LENGTH_LONG).show();
                    } else {
                        numintento--;
                        Toast.makeText(getApplicationContext(), "El numero ingresado es mayor", Toast.LENGTH_LONG).show();
                    }
                }
                if(numintento == 0){
                    Intent i = new Intent(getApplicationContext(), gameover.class);
                    i.putExtra("valornumerico", aleatorio);
                    startActivity(i);
                }
            }
        }
    }
}

