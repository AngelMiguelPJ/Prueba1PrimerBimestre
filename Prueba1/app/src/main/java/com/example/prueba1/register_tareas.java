package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class register_tareas extends AppCompatActivity implements View.OnClickListener {

    // variables
    EditText editTextActivity;
    Switch sw1;
    Switch sw2;
    Switch sw3;
    Button bt5;

    // variables de firebase
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_tareas);

        // Inicializacion de texto
        editTextActivity = (EditText) findViewById(R.id.edittext6);

        // iniciar botones swich
        sw1 = (Switch) findViewById(R.id.switch1);
        sw1.setOnClickListener(this);
        sw2 = (Switch) findViewById(R.id.switch2);
        sw2.setOnClickListener(this);
        sw3 = (Switch) findViewById(R.id.switch3);
        sw3.setOnClickListener(this);
        bt5 = (Button) findViewById(R.id.button5);
        bt5.setOnClickListener(this);


        //Iniciamos Firebase
        IniciarFirebase();

    }

    private void IniciarFirebase() {

        // Inicia Firebase en la aplicacion
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

    @Override
    public void onClick(View v) {
        String activitys = editTextActivity.getText().toString();




    }
}
