package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    //variables
    Button btn3;
    EditText editTextMail;
    EditText editTextUsername;
    EditText editTextPassword;

    // variables de firebase
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // busqueda de las variables
        // button de registro
        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);

        // Inicializacion de edit text
        editTextMail = (EditText) findViewById(R.id.edittext3);
        editTextUsername = (EditText) findViewById(R.id.edittext4);
        editTextPassword = (EditText) findViewById(R.id.edittext5);

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

        // cambio de variables
        String email = editTextMail.getText().toString();
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        if (v == btn3){
            Users sv = new Users();
            sv.setUserId(username);
            sv.setEmail(email);
            sv.setUserName(username);
            sv.setPassword(password);
            databaseReference.child("Usuarios").child(sv.getUserId()).setValue(sv);
            Toast.makeText(this, "Registrado",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);

        }
    }
}
