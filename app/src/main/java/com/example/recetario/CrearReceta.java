package com.example.recetario;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CrearReceta extends AppCompatActivity {

    public EditText NombreReceta, Descripcion;
    public Button CrearReceta;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crearreceta);


    }
}


