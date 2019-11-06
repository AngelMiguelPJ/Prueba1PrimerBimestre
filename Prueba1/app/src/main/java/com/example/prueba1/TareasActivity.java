package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TareasActivity extends AppCompatActivity implements View.OnClickListener {


    // Declaracion de variables
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tareas);

        fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v == fab){
            Intent intent = new Intent(getApplicationContext(), register_tareas.class);
            startActivity(intent);
        }

    }
}
